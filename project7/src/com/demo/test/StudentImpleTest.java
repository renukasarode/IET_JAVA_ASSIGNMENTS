package com.demo.test;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.demo.beans.*;

import com.demo.beans.Student;
import com.demo.service.StudentService;
import com.demo.service.StudentServiceImple;

public class StudentImpleTest {

	public static void main(String[] args) {
	  StudentService stdSer = new StudentServiceImple();
      System.out.println("Enter your choice");
      Scanner sc = new Scanner(System.in);
      int choice = 0;
      do 
      {
    	System.out.println("1. add new Student\n2. display all\n3. search by id");
  		System.out.println("4. Search by name\n5. update sal\n6. delete by id\n7. search by m1");
  		System.out.println("8. delete by m1 \n9. sort by m1\n10. sort by name\n11. sort by id\n12. sort by averageMarks\n13. exit\n choice: ");
  		choice=sc.nextInt();
  		switch(choice)
  		{
  		case 1->
  		{
  		  boolean status = stdSer.addStudent();
  		  if(status)
  		  {
  			 System.out.println("Student added Successfully!!!");
  		  }
  		  else
  		  {
  			  System.out.println("not added");
  		  }
  		}
  		case 2->{
  			List<Student> list =stdSer.displayAll();
  			if(list!=null)
  			{
  				list.forEach(System.out::println);
  			}
  			else
  			{
  				System.out.println("not found");
  			}
  		}
  		case 3->{
  			System.out.println("Enter the Id of the Student");
  			int id = sc.nextInt();
  			Student std =stdSer.searchByID(id);
  			if(std!=null)
  			{
  				System.out.println(std);
  			}
  			else
  			{
  				System.out.println("not found");
  			}
  		}
  		case 4->{
  			System.out.println("enter the name of the Student");
  			String name = sc.next();
  			List<Student> list = stdSer.searchByName(name);
  			if(list!=null)
  			{
  				list.forEach(System.out::println);
  			}
  			else
  			{
  				System.out.println("not found");
  			}
  		}
  		case 5->{
  			System.out.println("Enter the id of the student");
  				int id = sc.nextInt();
  				System.out.println("enter the m1 of the Student");
  				int m1 = sc.nextInt();
  			
  			boolean status = stdSer.updateM1(id,m1);
  			if(status)
  			{
  				System.out.println("m1 updated successfully!!!");
  			}
  			else
  			{
  				System.out.println("unable to update");
  			}
  		}
  		case 6->{
  			System.out.println("enter the id of the Student");
  			int id = sc.nextInt();
  			boolean status = stdSer.deleteById(id);
  			if(status)
  			{
  				System.out.println("Student deleted successfully");
  			}
  			else
  			{
  				System.out.println("not found for delete");
  			}
  		}
  		case 7->{
  			System.out.println("enter the m1");
  			int m1 =sc.nextInt();
  			List<Student> sList = stdSer.searchByM1(m1);
  			if(!sList.isEmpty())
  			{
  				sList.forEach(System.out::println);
  			}
  		}
  		case 8->{
  			System.out.println("enter the m1");
  			int m1 = sc.nextInt();
  			boolean status = stdSer.deleteByM1(m1);
  			if(status)
  			{
  				System.out.println("deleted successfully");
  			}
  			else
  			{
  				System.out.println("not found");
  			}
  		}
  		case 9->{
  			List<Student> list = stdSer.sortByM1();
  			if(!list.isEmpty())
  			{
  				list.forEach(System.out::println);
  			}
  			else
  			{
  				System.out.println("not sorted");
  			}
  		}
  		
  		case 10->{
  			System.out.println("in the case 7");
  			List<Student> sList = stdSer.sortByName();
  			if(!sList.isEmpty())
  			  sList.forEach(System.out::println);
  			
  			else
  			{
  				System.out.println("not found");
  			}
  		}
  		case 11->{
  			List<Student> list = stdSer.sortById();
  			if(!list.isEmpty())
  			{
  				list.forEach(System.out::println);
  			}
  			else
  			{
  				System.out.println("not sorted");
  			}
  		}
  		case 12->{
  			List<Student> list = stdSer.sortByAvegMarks();
  			if(!list.isEmpty())
  			{
  				list.forEach(System.out::println);
  			}
  			else
  			{
  				System.out.println("not sorted");
  			}
  		}
  		
  		case 13->{
  			sc.close();
  			System.out.println("thank you for visiting!!!");
  		}
  		default->{
  			System.out.println("please enter the correct choice.........");
  		}
  		
  		}
      }
      while(choice!=13);
	}

}
