package com.demo.dao;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Student;

public class StudentDaoImple implements StudentDao {
	static List<Student> sList = new ArrayList<>();
	
	static 
	{
	   sList.add(new Student(1, "renu", 78, 88));
	   sList.add(new Student(2, "str", 45, 54));
	   sList.add(new Student(3, "rtrtrt", 45, 454));
	}

	@Override
	public boolean saveStudent(Student std) {
		sList.add(std);
		return true;
	}

	@Override
	public List<Student> findAll() {
		return sList;
	}

	@Override
	public Student findByID(int id) {
		int pos = sList.indexOf(new Student(id));
		if(pos!=-1)
		{
		return sList.get(pos);
		}
		return null;
	}

	@Override
	public List<Student> findByName(String name) {
		return sList.stream().filter(emp->emp.getName().equals(name)).collect(Collectors.toList());
	}

	@Override
	public boolean updateM1(int id, int m1) {
		Student std = findByID(id);
		if(std!=null)
		{
			std.setM1(m1);
			return true;
		}
		return false;
	}

	@Override
	public boolean removeById(int id) {
		return sList.remove(new Student(id));
	}

	@Override
	public List<Student> sortByName() {
		List<Student> lStd = new ArrayList<>();
		for(Student std:sList)
		{
			lStd.add(std);
		}
		Comparator<Student> stdC = (obj1,obj2)->{
			return obj1.getName().compareTo(obj2.getName());
		};
		lStd.sort(stdC);
		return lStd;
		
	}

	@Override
	public List<Student> findByM1(int m1) {
		return sList.stream().filter((emp)->emp.getM1()==m1).collect(Collectors.toList());
	}

	@Override
	public boolean deleteByM1(int m1) {
		return sList.removeAll(findByM1(m1));
	}

	@Override
	public List<Student> sortByM1() {
		List<Student> sLis1 = new ArrayList<>();
		for(Student std:sList)
		{
			sLis1.add(std);
		}
		Comparator<Student> cS = (o1,o2)->{
			return o1.getM1()-o2.getM1();
		};
		sLis1.sort(cS);
		return sLis1;
	}

	@Override
	public List<Student> sortByID() {
		List<Student> sLis1 = new ArrayList<>();
		for(Student std:sList)
		{
			sLis1.add(std);
		}
		sLis1.sort(null);
		return sLis1;
	}

	@Override
	public List<Student> sortByAvgMarks() {
		List<Student> sLis1 = new ArrayList<>();
		for(Student std:sList)
		{
			sLis1.add(std);
		}
		Comparator<Student> cS = (o1,o2)->{
			return (int)(o1.getAvg()-o2.getAvg());
		};
		sLis1.sort(cS);
		return sLis1;
	}

}
