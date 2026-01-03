package com.demo.dao;

import java.util.List;

import com.demo.beans.Customer;
import com.demo.beans.Item;

public interface OrderDao {

	boolean createCustomer(Customer c, List<Item> list);

}
