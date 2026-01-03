package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderService {

	boolean AddCustomer();

	Map<Customer, List<Item>> displayAll();

	Entry<Customer, List<Item>> displayByCustomer(int cid);

	boolean deleteCustomer(int id);

	boolean addNewItemExistingOrder(int cid, int id);

	boolean deleteItemExistingOrder(int cId, int id);

}
