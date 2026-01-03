package com.demo.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public class OrderDaoImple implements OrderDao {
	static Map<Customer,List<Item>> hm = new HashMap<>();
	static {
		List<Item> list = new ArrayList<>();
		 list.add(new Item(1,"bag",3,400.00));
		 list.add(new Item(2,"pen",10,100.00));
		 list.add(new Item(3,"chair",6,1200.00));
		 
		 
		
		hm.put(new Customer(1,"mitali","45435343444"),list);
	}

	@Override
	public boolean createCustomer(Customer c, List<Item> list) {
		if(!hm.containsKey(c))
		{
		 hm.put(c, list);
		 return true;
		}
		return false;
	}

	@Override
	public Map<Customer, List<Item>> findAll() {
		return hm;
	}

	@Override
	public Entry<Customer, List<Item>> findByCustomer(int cid) {
		Set<Map.Entry<Customer, List<Item>>> mp = hm.entrySet();
		for(Map.Entry<Customer, List<Item>> e:mp)
		{
			return e;
		}
		return null;
	}

	@Override
	public boolean removeCustomer(int id) {
		
		 return null!= hm.remove(new Customer(id));
		  
		
	}

	@Override
	public boolean addNewItemExistingOrder(int cid,Item i) {
		List<Item> list = hm.get(findByCustomer(cid).getKey());
//		List<Item> list = hm.get(new Customer(cid);
		if( list!=null ||!list.isEmpty())
		{
			list.add(i);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteItemExistingOrder(int cId, int id) {
		List<Item> list = findByCustomer(cId).getValue();
		if(list!=null && !list.isEmpty())
		{
			return list.remove(new Item(id));
		}
		return false;
	}
}
