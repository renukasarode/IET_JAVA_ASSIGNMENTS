package com.demo.test;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImple;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

public class EmpoyeeTest {

	public static void main(String[] args) {
		EmployeeService eSer = new EmployeeServiceImple();
		Scanner sc = new Scanner(System.in);
		int choice =0;
		do {
			System.out.println("enter the choice.....");
			System.out.println("1. add new employee\n 2. display all\n3. search by id");
			System.out.println("4. Search by name\n 5. update sal\n6. delete by id\n7. delete by salary\n");
			System.out.println("8. search by salary \n 9. sort by salary\n10. Sort By name\n 11. Sort By id\n12. exit\n choice: ");
		    choice = sc.nextInt();
		    switch(choice)
		    {
		    case 1->{
		    	boolean status = eSer.addEmployee();
		    	if(status)
		    	{
		    		System.out.println("added successfully");
		    	}
		    	else
		    	{
		    		System.out.println("not added");
		    	}
		    }
		    case 2->{
		    	Set<Employee> eSet = eSer.displayAll();
		    	if(!eSet.isEmpty())
		    	{
		    		eSet.forEach(System.out::println);
		    	}
		    	else
		    	{
		    		System.out.println("not found");
		    	}
		    }
		    case 3->{
		        System.out.println("Enter the id of the employee");
		        int id = sc.nextInt();
		        Employee emp =eSer.searchByID(id);
		        if(emp!=null)
		        {
		        	System.out.println(emp);
		        }
		        else
		        {
		        	System.out.println("not found");
		        }
		    }
		    case 4->{
		    	System.out.println("enter the name of the employee");
		    	String name = sc.next();
		    	Set<Employee> eSet = eSer.searchByName(name);
		    	if(!eSet.isEmpty())
		    	{
		    		eSet.forEach(System.out::println);
		    	}
		    	else
		    	{
		    		System.out.println("not found");
		    	}
		    }
		    case 5->{
		    	System.out.println("enter the id of the employee");
		    	int id = sc.nextInt();
		    	System.out.println("enter the salary of the employee");
		    	double salary = sc.nextDouble();
		    	boolean status = eSer.modifySalary(id,salary);
		    	if(status)
		    	{
		    		System.out.println("salary updated successfully");
		    	}
		    	else
		    	{
		    		System.out.println("not found");
		    	}
		    }
		    case 6->{
		    	System.out.println("Enter the id of the employee");
		    	int id = sc.nextInt();
		    	boolean status = eSer.deleteByID(id);
		    	if(status)
		    	{
		    		System.out.println("deleted successfully!!!");
		    	}
		    	else
		    	{
		    		System.out.println("not found");
		    	}
		    }
		    case 7->{
		    	System.out.println("enter the salary of the employee");
		    	double salary = sc.nextDouble();
		    	boolean status = eSer.deleteBySalary(salary);
		    	if(status)
		    	{
		    		System.out.println("deleted successfully!!!");
		    	}
		    	else
		    	{
		    		System.out.println("not found");
		    	}
		    }
		    case 8->{
		    	System.out.println("enter the salary of the employee");
		    	double salary = sc.nextDouble();
		    	Set<Employee> eSet = eSer.searchBySalary(salary);
		    	if(!eSet.isEmpty())
		    	{
		    		eSet.forEach(System.out::println);
		    	}
		    	else
		    	{
		    		System.out.println("not found");
		    	}
		    }
		    case 9->{
		    	List<Employee> eList = eSer.sortBySalary();
		    	if(!eList.isEmpty())
		    	{
		    	  eList.forEach(System.out::println);
		    	}
		    	else
		    	{
		    		System.out.println("not sorted");
		    	}
		    }
		    case 10->{
		    	List<Employee> list = eSer.sortByName();
		    	if(!list.isEmpty())
		    	{
		    		list.forEach(System.out::println);
		    	}
		    	else
		    	{
		    		System.out.println("not sorted");
		    	}
		    }
		    case 11->{
		    	Set<Employee> set = eSer.sortByID();
		    	if(!set.isEmpty())
		    	{
		    	  set.forEach(System.out::println);
		    	}
		    	else
		    	{
		    		System.out.println("not found");
		    	}
		    }
		    case 12->{
		    	sc.close();
		    	System.out.println("thank you for visiting");
		    	
		    }
		    default->{
		    	System.out.println("please enter the correct choice");
		    }
		    
		    }
		}while(choice!=12);
		

	}

}
