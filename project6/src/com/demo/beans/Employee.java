package com.demo.beans;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private int id;
	private String ename;
	private double salary;
	private LocalDate date;
	public Employee() {
		super();
	}
	public Employee(int id, String ename, double salary, LocalDate date) 
	{
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
		this.date = date;
	}
	public Employee(int id2) {
		super();
		this.id = id2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	@Override
	public boolean equals(Object obj) {
//		System.out.println("in equals");
		return ((Employee)obj).id==this.id;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + ", date=" + date + "]";
	}
	@Override
	public int compareTo(Employee emp) {
//		if(this.getSalary()>emp.getSalary())
//		{
//			return 1;
//		}
//		else if(this.getSalary() <emp.getSalary())
//		{
//			return -1;
//		}
//		return 0;
		//in ascending order
		return  (int)(this.salary-emp.salary);
		//in descending order
				//return  (int)(emp.salary-this.salary);
}
	
	
	
	
	
	
	

}
