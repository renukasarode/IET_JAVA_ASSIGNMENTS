package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import comparator.*;

import com.demo.beans.Employee;

public class EmployeeDaoImple implements EmployeeDao {
	static List<Employee> eList;
	static
	{
		eList = new ArrayList<>();
		eList.add(new Employee(100,"ert",45000, LocalDate.of(2004,04,18)));
		eList.add(new Employee(101,"ert",454545, LocalDate.of(2004,04,17)));
		eList.add(new Employee(102,"ertrt",450000, LocalDate.of(2004,04,20)));
	}

	@Override
	public boolean saveAll(Employee emp) {
		eList.add(emp);
 		return true;
	}

	@Override
	public List<Employee> findAll() {
		return eList;
	}

	@Override
	public Employee findByID(int id) {
//		old logic
//		for(Employee emp:eList)
//		{
//		   if(emp.getId()==id)
//		   {
//			   return emp;
//		   }
//		}
//		return null;
		//for stram.filter.findFirst
//		Optional<Employee> op = eList.stream().filter(emp->emp.getId()==id).findFirst();
//		if(op.isPresent())
//		{
//			return op.get();
//		}
//		return null;
      int pos = eList.indexOf(new Employee(id))                   ;
      if(pos>=0)
      {
      return eList.get(pos);
      }
      return null;
	}

	@Override
	public List<Employee> findByName(String name) {
		List<Employee> eListTemp =eList.stream().filter(emp->emp.getEname().equals(name)).collect(Collectors.toList());
		return eListTemp;
	}

	@Override
	public boolean updateSal(int id,double salary) {
		Employee emp =findByID(id);
		if(emp!=null)
		{
			emp.setSalary(salary);
			return true;
		}
 		return false;
	}

	@Override
	public boolean deleteById(int id) {
		if(findByID(id)!=null)
		{
			eList.remove(findByID(id));
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteBySal(double salary) {
		if(!findBySalary(salary).isEmpty())
		{
			eList.removeAll(findBySalary(salary));
			return true;
		}
		return false;
	}

	@Override
	public List<Employee> findBySalary(double salary) {
		return eList.stream().filter(emp->emp.getSalary()==salary).collect(Collectors.toList());
	  
	}

	@Override
	public List<Employee> sortBySal() {
//		List<Employee> sortedList= new ArrayList<>();
		//old method of sorting
//				for(int i=0;i<eList.size()-1;i++)
//				{
//					if(eList.get(i)!=null)
//					{
//					 if(eList.get(i).getSalary()>eList.get(i+1).getSalary())
//					 {
//					 Employee temp =eList.get(i);
//					 eList.set(i, eList.get(i+1));
//					 eList.set(i+1,temp);
//					 }
//				   }
//			    }
				List<Employee> tempList= new ArrayList<>();
				for(Employee emp:eList)
				{
					tempList.add(emp);
				}
				tempList.sort(null);
		return tempList;
	}

	@Override
	public List<Employee> sortByName() {
		List<Employee> tempList= new ArrayList<>();
		for(Employee emp:eList)
		{
			tempList.add(emp);
		}
		MyNameComparator c = new MyNameComparator();
		tempList.sort(c);		
		return tempList;
	}

	@Override
	public List<Employee> sortByID() {
		List<Employee> tempList= new ArrayList<>();
		for(Employee emp:eList)
		{
			tempList.add(emp);
		}
		Comparator<Employee> c =(obj1,obj2)->{
			return obj1.getId()-obj2.getId();
		};
		tempList.sort(c);
		return tempList;
	
	}

}
