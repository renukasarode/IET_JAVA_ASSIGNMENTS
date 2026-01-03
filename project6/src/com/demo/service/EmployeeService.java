package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	 boolean addEmpoyee();

	 List<Employee> displayAll();

	 Employee searchByID(int id);

	List<Employee> searchByName(String name);

	boolean updateSalary(int id,double salary);

	boolean deleteByID(int id);

	boolean deleteBySalary(double salary);
   	List<Employee> searchBySalary(double salary);

   	List<Employee> sortBySalary();

	List<Employee> sortByName();

	List<Employee> sortById();

}
