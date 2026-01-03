package com.demo.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.service.OrderService;
import com.demo.service.OrderServiceImple;

public class TestOrderMgnt {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		OrderService oSer = new OrderServiceImple();
		
		
		int choice = 0;
		do
		{
			System.out.println("1. add new customer\n2. display all\n3. display by customer");
			System.out.println("4. delete customer\n5. add a new item in existing order");
			System.out.println("6. delete item from existing order\n7.exit\n choice:");
			choice = sc.nextInt();
			
		switch(choice)
		{
			case 1 ->
			{
			  boolean status = oSer.AddCustomer();
			  if(status)
			  {
				  System.out.println("added successfully");
			  }
			  else
			  {
				  System.out.println("not added");
			  }
			}
			case 2 ->
			{
				Map<Customer,List<Item>> hMap = oSer.displayAll();
				if(!hMap.keySet().isEmpty())
				{
					for(Customer c:hMap.keySet())
					{
						System.out.println(c+"---------->Items are: "+hMap.get(c));
					}
				}
				else
				{
					System.out.println("not added");
				}
			}
			case 3 ->
			{
				System.out.println("enter the customer Id");
				int cid = sc.nextInt();
				Map.Entry<Customer,List<Item>> data = oSer.displayByCustomer(cid);
				if(data!=null)
				{
					System.out.println(data.getKey()+"------>"+data.getValue());
				}
				else
				{
					System.out.println("not found");
				}
			}
			case 4 ->
			{
				System.out.println("enter the Id of the customer");
				int id = sc.nextInt();
				boolean status = oSer.deleteCustomer(id);
				if(status)
				{
					System.out.println("deleted successfully");
				}
				else
				{
					System.out.println("not found to delete");
				}
			}
			case 5 ->
			{
				System.out.println("enter the id of the customer");
				int cId = sc.nextInt();
			  System.out.println("enter the id of the item");
			  int id = sc.nextInt();
			  boolean status = oSer.addNewItemExistingOrder(cId,id);
			  if(status)
			  {
				  System.out.println("added successfully");
			  }
			  else
			  {
				  System.out.println("not found");
			  }
			}
			case 6 ->
			{
				System.out.println("enter the id of the customer");
				int cId = sc.nextInt();
			  System.out.println("enter the id of the item");
			  int id = sc.nextInt();
				 boolean status = oSer.deleteItemExistingOrder(cId,id);
				  if(status)
				  {
					  System.out.println("deleted successfully");
				  }
				  else
				  {
					  System.out.println("not found");
				  }
				
			}
			case 7 ->
			{
				
				sc.close();
			}
			default->{
			 System.out.println("please enter the correct choice...");
			}
			}
		}while(choice!=7);
		

	}

}
