package com.demo.service;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImple;

public class EmployeeServiceImpl implements EmployeeService{
	 private EmployeeDao eDao=null;
	public EmployeeServiceImpl()
	{
		 eDao = new EmployeeDaoImple();
	}

	@Override
	public boolean addEmpoyee() {
        Scanner sc = new Scanner(System.in);
 		System.out.println("enter the id of the employee");
		int id = sc.nextInt();
		System.out.println("enter the name of th employee");
		String name = sc.next();
		System.out.println("enter the salary of the employee");
		double salary = sc.nextDouble();
		System.out.println("enter the joining date of the employee of format dd/mm/yyyy");
		String jDate = sc.next();
		LocalDate date = null;
		try {
		   date = LocalDate.parse(jDate,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		}
		catch(Exception e)
		{
			System.out.println("PLease enter the date in the proper format of dd/mm/yyyy");
			return false;
 		}
		Employee emp = new Employee(id,name,salary,date);
		return eDao.saveAll(emp);
	}

	@Override
	public List<Employee> displayAll() {
		return eDao.findAll();
	}

	@Override
	public Employee searchByID(int id) {
       return eDao.findByID(id);		
	}

	@Override
	public List<Employee> searchByName(String name) {
		
   		return eDao.findByName(name);
	}

	@Override
	public boolean updateSalary(int id,double salary) {
		return eDao.updateSal(id,salary);
	}

	@Override
	public boolean deleteByID(int id) {
		// TODO Auto-generated method stub
		return eDao.deleteById(id);
	}

	@Override
	public boolean deleteBySalary(double salary) {
		return eDao.deleteBySal(salary);
	}

	@Override
	public List<Employee> searchBySalary(double salary) {
		return eDao.findBySalary(salary);
	}

	@Override
	public List<Employee> sortBySalary() {
		return eDao.sortBySal();
	}

	@Override
	public List<Employee> sortByName() {
		return eDao.sortByName();
	}

	@Override
	public List<Employee> sortById() {
      return eDao.sortByID();
	}

}
