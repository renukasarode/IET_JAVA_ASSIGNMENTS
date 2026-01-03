package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean saveAll(Employee emp);

	List<Employee> findAll();

	Employee findByID(int id);

	List<Employee> findByName(String name);

	boolean updateSal(int id,double salary);

	boolean deleteById(int id);

	boolean deleteBySal(double salary);

	List<Employee> findBySalary(double salary);

	List<Employee> sortBySal();

	List<Employee> sortByName();

	List<Employee> sortByID();

}
