package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImple;

public class EmployeeServiceImple implements EmployeeService{
	Scanner sc = new Scanner(System.in);
   private EmployeeDao eDao=null;
	public EmployeeServiceImple()
	{
		eDao = new EmployeeDaoImple();
	}

	@Override
	public boolean addEmployee() {
		
		System.out.println("enter the id of the employee");
		int id = sc.nextInt();
		System.out.println("enter the name of the employee");
		String name = sc.next();
		System.out.println("Enter the salary of the empployee");
	    double salary = sc.nextDouble();
	    System.out.println("enter the joining date in the format DD/mm/yyyy");
	    String date = sc.next();
	    LocalDate newDate=null;
	    try {
	      newDate = LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	    }
	    catch(Exception exception)
	    {
	    	System.out.println("please enter the date in proper format as DD/mm/yyyy ");
	        return false;
	    }
		Employee emp = new Employee(id,name,salary,newDate);
		return eDao.addEmployee(emp);
	}

	@Override
	public Set<Employee> displayAll() {
		return eDao.findAll();
	}

	@Override
	public Employee searchByID(int id) {
		return eDao.findById(id);
	}

	@Override
	public Set<Employee> searchByName(String name) {
		return eDao.findByName(name);
	}

	@Override
	public boolean modifySalary(int id, double salary) {
		return eDao.updateSalary(id,salary);
	}

	@Override
	public boolean deleteByID(int id) {
		return eDao.removeById(id);
	}

	@Override
	public boolean deleteBySalary(double salary) {
		return eDao.removeBySalary(salary);
	}

	@Override
	public Set<Employee> searchBySalary(double salary) {
		return eDao.findBySalary(salary);
	}

	@Override
	public List<Employee> sortBySalary() {
		return eDao.sortBySalary();
	}

	@Override
	public List<Employee> sortByName() {
		return eDao.sortByName();
	}

	@Override
	public Set<Employee> sortByID() {
		return eDao.sortByID();
	}

}
