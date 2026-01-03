package com.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addEmployee();

	Set<Employee> displayAll();

	Employee searchByID(int id);

	Set<Employee> searchByName(String name);

	boolean modifySalary(int id, double salary);

	boolean deleteByID(int id);

	boolean deleteBySalary(double salary);

	Set<Employee> searchBySalary(double salary);

	List<Employee> sortBySalary();

	List<Employee> sortByName();

	Set<Employee> sortByID();

}
