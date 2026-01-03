package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;

public class EmployeeDaoImple implements EmployeeDao {
	static Set<Employee> eSet = new HashSet<>();
	static
	{
		eSet.add(new Employee(1,"avrt",45000,LocalDate.of(2001,05,30)));
		eSet.add(new Employee(3,"avt",44667,LocalDate.of(2004,05,30)));
		eSet.add(new Employee(2,"avr",23000,LocalDate.of(2005,05,30)));
		eSet.add(new Employee(5,"av",8888,LocalDate.of(2006,05,30)));
	}
	

	@Override
	public boolean addEmployee(Employee emp) {
		return eSet.add(emp);
	}

	@Override
	public Set<Employee> findAll() {
		return eSet;
	}

	@Override
	public Employee findById(int id) {
		return eSet.stream().filter((emp)->emp.getId()==id).findFirst().get();
	}

	@Override
	public Set<Employee> findByName(String name) {
		return eSet.stream().filter((emp)->emp.getName().equals(name)).collect(Collectors.toSet());
	}

	@Override
	public boolean updateSalary(int id, double salary) {
		Employee emp = findById(id);
		if(emp!=null)
		{
		emp.setSalary(salary);
		return true;
		}
		return false;
	}

	@Override
	public boolean removeById(int id) {
		return eSet.remove(new Employee(id));
	}

	@Override
	public boolean removeBySalary(double salary) {
		Set<Employee> e1Set1 = eSet.stream().filter((emp)->emp.getSalary()>salary).collect(Collectors.toSet());
		return eSet.removeAll(e1Set1);
	}

	@Override
	public Set<Employee> findBySalary(double salary) {
		return eSet.stream().filter((emp)->emp.getSalary()==salary).collect(Collectors.toSet());
	}

	@Override
	public List<Employee> sortBySalary() {
//		Set<Employee> eSet1 = new HashSet<>();
		List<Employee> li = new ArrayList<>(eSet);
		
		Comparator<Employee> ec = (e1,e2)->{
			return (int)(e1.getSalary()-e2.getSalary());
		};
		li.sort(ec);
		return li;
	}

	@Override
	public List<Employee> sortByName() {
     List<Employee> li = new ArrayList<>(eSet);
		
		Comparator<Employee> ec = (e1,e2)->{
			return (e1.getName().compareTo(e2.getName()));
		};
		li.sort(ec);
		return li;
		//this will remove duplicate as per this comparator compare method
//		Comparator<Employee> ec = (e1,e2)->{
//			return (e1.getName().compareTo(e2.getName()));
//		};
//		Set<Employee> eSet1 = new TreeSet<>(ec);
//		for(Employee emp:eSet)
//		{
//			eSet1.add(emp);
//		}
//		return new ArrayList<>(eSet1);
	}

	@Override
	public Set<Employee> sortByID() {
//	  Set<Employee> eSet1 = new TreeSet<>(eSet);
//		return eSet1;
		return new TreeSet<>(eSet);
	}
}
