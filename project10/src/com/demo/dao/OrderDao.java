package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderDao {

	boolean createCustomer(Customer c, List<Item> list);

	Map<Customer, List<Item>> findAll();

	Entry<Customer, List<Item>> findByCustomer(int cid);

	boolean removeCustomer(int id);

	boolean addNewItemExistingOrder(int cid, Item i);

	boolean deleteItemExistingOrder(int cId, int id);

}
