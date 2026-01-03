package com.demo.test;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
public class TestEmployeeClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eSer = new EmployeeServiceImpl();
      System.out.println("enter your choice:");
      int choice=0;
      do {
    	System.out.println("1. add new employee\n2. display all\n3. search by id");
		System.out.println("4. Search by name\n5. update sal\n6. delete by id\n7. search by salary");
		System.out.println("8. delete by salary \n9. sort by salary\n10. sort by name\n11. sort by id\n12. exit\n choice: ");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
			boolean status = eSer.addEmpoyee();
			if(status)
			{
				System.out.println("Employee added Successfully!!!");
			}
			else
			{
				System.out.println("not added");
			}
			break;
		}
		case 2:
		{
			List<Employee> eList = eSer.displayAll();
			if(!eList.isEmpty())
			{
				eList.forEach(System.out::println);
			}
			break;
		}
		case 3:
		{
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
			break;
		}
		case 4:
		{
			System.out.println("Enter the name of the Employee");
            String name = sc.next();
           List<Employee>list = eSer.searchByName(name);
           if(!list.isEmpty())
           {
        	   list.forEach(System.out::println);
           }
           else
           {
        	   System.out.println("not found");
           }
			break;
		}
		case 5:
		{
			System.out.println("enter the id of the employee");
			int id = sc.nextInt();
			System.out.println("enter the salary of the Employee");
			double salary = sc.nextDouble();
			
			boolean status = eSer.updateSalary(id,salary);
			if(status)
			{
				System.out.println("salary updated successfully!!!");
			}
			else
			{
				System.out.println("not found");
			}
			break;
		}
		case 6:
		{
			System.out.println("enter the id of the employee");
			int id =sc.nextInt();
			boolean status = eSer.deleteByID(id);
			if(status)
			{
				System.out.println("employee deleted successfully!!");
			}
			else
			{
				System.out.println("not found");
			}
			break;
		}
		case 7:
		{   
			System.out.println("enter the salary of the employee");
		    double salary = sc.nextDouble();
		   List<Employee> list = eSer.searchBySalary(salary);
		   if(!list.isEmpty())
		   {
			   list.forEach(System.out::println);
		   }
		   else
		   {
			   System.out.println("not found");
		   }
		   break;
		}
		case 8:
		{
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
			break;
		}
		case 9:
		{
			List<Employee> list = eSer.sortBySalary();
			if(!list.isEmpty())
			{
				list.forEach(System.out::println);
			}
			else
			{
				System.out.println("not sorted");
			}
			break;
		}
		case 10:
		{
			List<Employee> eList =eSer.sortByName();
			if(!eList.isEmpty())
			{
				eList.forEach(System.out::println);
			}
			else
			{
				System.out.println("not found");
			}
			
			break;
		}
		case 11:
		{
			List<Employee> list = eSer.sortById();
			if(!list.isEmpty())
			{
				list.forEach(System.out::println);
			}
			else
			{
				System.out.println("not found");
			}
			break;
		}
		case 12:
		{
			sc.close();
			System.out.println("thank you for visiting!!!");
			break;
		}
		default:
		{
			System.out.println("please enter the correct choice");
		}
		}
      }
      while(choice!=12);
	}

}
