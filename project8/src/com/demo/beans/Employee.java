package com.demo.beans;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private int id;
	private String name;
	private double salary;
	private LocalDate jDate;
	public Employee() {
		super();
	}
	public Employee(int id, String name, double salary, LocalDate jDate) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.jDate = jDate;
	}
	public Employee(int id2) {
        id=id2;
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
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getjDate() {
		return jDate;
	}
	public void setjDate(LocalDate jDate) {
		this.jDate = jDate;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", jDate=" + jDate + "]";
	}
//	@Override
//	public int hashCode() {
//		System.out.println("in hashCode");
//		return id;
//	}
	@Override
	public boolean equals(Object obj) {
		return ((Employee)obj).id==id;
	}
	@Override
	public int compareTo(Employee o) {
		return id-o.id;
	}
	

}
