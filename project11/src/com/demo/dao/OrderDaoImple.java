package com.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public class OrderDaoImple implements OrderDao {
	static Map<Customer,List<Item>> hm = new HashMap<>();
	static {
		List<Item> list = new ArrayList<>();
		 list.add(new Item(1,"bag",3,400.00));
		 list.add(new Item(1,"pen",10,100.00));
		 list.add(new Item(1,"chair",6,1200.00));
		 
		 
		
		hm.put(new Customer(1,"mitali","45435343444"),list);
	}

	@Override
	public boolean createCustomer(Customer c, List<Item> list) {
		return false;
	}

}
