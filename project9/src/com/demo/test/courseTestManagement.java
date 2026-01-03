package com.demo.test;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.service.courseService;
import com.demo.service.courseServiceImple;

public class courseTestManagement {

	public static void main(String[] args) {
		courseService cSer = new courseServiceImple();
		Scanner sc = new Scanner(System.in);
		int choice=0;
		do {
			System.out.println("enter your chice");
			System.out.println("1. Add new Course\n 2. display all\n3. find by course name\n");
			System.out.println("4. modify course capacity\n 5. find by course capacity\n6. modify course name\n");
			System.out.println("7. display in sorted order of key\n 8. display  in sorted order of value\n");
			System.out.println("9. delete by course name\n10. delete by capacity\n 11.exit\n choice: ");
			choice = sc.nextInt();
			switch(choice) {
			case 1->{
			 boolean status = cSer.addNewCourse();	
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
				Map<String,Integer> map = cSer.displayAll();
				if(!map.isEmpty())
				{
					Set<String> keySet = map.keySet();
					keySet.forEach(key->System.out.println(key+"-------:"+map.get(key)));
				}
				else
				{
					System.out.println("not found");
				}
			}
			case 3->{
				System.out.println("enter the courseName");
				String name = sc.next();
				Integer value= cSer.FindByCourseName(name);
				if(value!=-1)
				{
					System.out.println("capacity of the course   " +name+ " :------- "+value);
				}
				else
				{
					System.out.println("no capacity initialised for the course");
				}
			}
			case 4->{
				System.out.println("enter the course name");
				String course = sc.next();
				System.out.println("enter the value of capacity");
				int cap = sc.nextInt();
				boolean status = cSer.modifyCapacity(course,cap);
				if(status)
				{
					System.out.println("updated successfully!!");
				}
				else
				{
					System.out.println("not added to update....");
				}
			}
			case 5->{
				System.out.println("enter the value of the Course Capacity");
				int cap = sc.nextInt();
				Set<String> courses = cSer.FindByCourseCapacity(cap);
				if(!courses.isEmpty())
				{
					courses.forEach(System.out::println);
				}
				else
				{
					System.out.println("not found");
				}
			}
			case 6->{
				System.out.println("enter the value of the Course you have to update");
				String course = sc.next();
				System.out.println("enter the course you have to change");
				String uCourse = sc.next();
			 boolean status =  cSer.modifyCourseName(course,uCourse);
			 if(status)
			 {
				 System.out.println("updated successfully");
			 }
			 else
			 {
				 System.out.println("not updated cause not found");
			 }
			}case 7->{
				Map<String,Integer> map = cSer.displayInSortedOrder();
			  if(!map.isEmpty())
			  {
				  Set<String> keySet = map.keySet();
					keySet.forEach(key->System.out.println(key+"-------:"+map.get(key)));
			  }
			}
			
			case 8->{
				Set<Map.Entry<String, Integer>> sortedSet = cSer.displayInSortedOrderofCapacity();
				  if(!sortedSet.isEmpty())
				  {
						sortedSet.forEach(ele->System.out.println(ele.getKey()+"-------:"+ele.getValue()));
				  }
				}
			
			case 9->{
				System.out.println("enter the value of the course");
				String name = sc.next();
				boolean status = cSer.deleteByCourseName(name);
				if(status)
				{
					System.out.println("deleted Successfully");
				}
				else
				{
					System.out.println("not deleted");
				}
			}
			
			case 10 ->
			{
				System.out.println("enter the capacity of course u want to delete");
				int cap = sc.nextInt();
				boolean flag = cSer.DeleteByCapacity(cap);
				if(flag)
				{
					System.out.println("deleted successfully");
				}
				else
				{
					System.out.println("not found to delete");
				}
				
				
			}
			case 11->{
				sc.close();
				System.out.println("thank you for visiting");
			}
			default ->{
				System.out.println("please enter correct choice");
			}
			
			}
			
		}
		while(choice!=11);
	}
}
