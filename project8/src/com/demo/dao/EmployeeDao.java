package com.demo.dao;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean addEmployee(Employee emp);

	Set<Employee> findAll();

	Employee findById(int id);

	Set<Employee> findByName(String name);

	boolean updateSalary(int id, double salary);

	boolean removeById(int id);

	boolean removeBySalary(double salary);

	Set<Employee> findBySalary(double salary);

	List<Employee> sortBySalary();

	List<Employee> sortByName();

	Set<Employee> sortByID();

}
