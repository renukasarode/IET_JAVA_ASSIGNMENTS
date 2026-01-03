package com.demo.test;

import java.util.Scanner;

import com.demo.service.OrderService;
import com.demo.service.OrderServiceImple;

public class TestOrderMgnt {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		OrderService oSer = new OrderServiceImple();
		
		
		int choice = 0;
		do
		{
			System.out.println("1. add new customer\\n2. display all\\n3. display by customer");
			System.out.println("4. delete customer\n5. add a new item in existing order");
			System.out.println("6. delete item from existing order\n7.exit\n choice:");
			choice = sc.nextInt();
			
		switch(choice)
		{
			case 1 ->
			{
			  boolean status = oSer.AddCustomer();
			}
			case 2 ->
			{
				
			}
			case 3 ->
			{
				
			}
			case 4 ->
			{
				
			}
			case 5 ->
			{
				
			}
			case 6 ->
			{
				
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
