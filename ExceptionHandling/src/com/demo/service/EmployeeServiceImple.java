package com.demo.service;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.exception.NegativeSalaryException;

public class EmployeeServiceImple implements EmployeeService{
	Employee emp =null;	
	public void acceptData() throws NegativeSalaryException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the salary of the Employee");
		double salary = sc.nextDouble();
		emp = new Employee(1,"abc",salary);
		System.out.println("employee object get created successfully!!!");
		emp.setSalary(salary);
		System.out.println("employee salary updated successfully");
	}
}

