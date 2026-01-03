package com.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Customer;
import com.demo.beans.Item;
import com.demo.dao.OrderDao;
import com.demo.dao.OrderDaoImple;

public class OrderServiceImple implements OrderService {
	OrderDao sDao=null;
	public OrderServiceImple()
	{
		 sDao = new OrderDaoImple();
	}

	@Override
	public boolean AddCustomer() {
		
		Scanner sc = new Scanner(System.in);
		List<Item> list = new ArrayList<>();
		System.out.println("enter the id of customer");
		int cID = sc.nextInt();
		System.out.println("enter the name of customer");
		String cName = sc.next();
		System.out.println("enter the mobileNumber of customer");
		String mNo = sc.next();
		System.out.println("enter the number of items you puchased");
		int iNo = sc.nextInt();
		int i=0;
		do {
		System.out.println("enter the id of the item");
		int iId =sc.nextInt();
		System.out.println("enter the name of the item");
		String iName =sc.next();
		System.out.println("enter the quantity of the item");
		int iQty =sc.nextInt();
		System.out.println("enter the price of the item");
		double price = sc.nextDouble();
		Item i1 = new Item(iId,iName,iQty,price);
		list.add(i1);
		i++;
		}while(iNo!=i);
		Customer c = new Customer(cID,cName,mNo);
		
		return sDao.createCustomer(c,list);
	}

}
