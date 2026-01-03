package com.demo.beans;

import com.demo.exception.NegativeSalaryException;

public class Employee {
  private int id;
  private String name;
  private double salary;
public Employee() {
	super();
}
public Employee(int id, String name, double salary) throws NegativeSalaryException {
	super();
	this.id = id;
	this.name = name;
	 setSalary(salary);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) throws NegativeSalaryException {
	if(salary<0)
	{
		throw new NegativeSalaryException("salary should not be negative");
	}
	else if(salary<2000)
	{
		throw new NegativeSalaryException("salary cannot be less than 2000");
	}
	this.salary = salary;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
  
}
