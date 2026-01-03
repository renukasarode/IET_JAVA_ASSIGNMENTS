package com.demo.service;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.dao.StudentDaoImple;
import com.demo.test.StudentImpleTest;

public class StudentServiceImple implements StudentService{
	StudentDao stdDao=null;
	Scanner sc = new Scanner(System.in);
	
	public StudentServiceImple()
	{
	   stdDao = new StudentDaoImple();
	}

	@Override
	public boolean addStudent() {
		System.out.println("enter id of the student");
		int id = sc.nextInt();
		System.out.println("enter name of the student");
		String name = sc.next();
		System.out.println("enter the marks of first subject");
		int m1 = sc.nextInt();
		System.out.println("enter the marks of second subject");
		int m2 = sc.nextInt();
		
		Student std = new Student(id, name, m1, m2);
		
		return stdDao.saveStudent(std);
	}

	@Override
	public List<Student> displayAll() {
		return stdDao.findAll();
	}

	@Override
	public Student searchByID(int id) {
		return stdDao.findByID(id);
	}

	@Override
	public List<Student> searchByName(String name) {
		return stdDao.findByName(name);
	}

	@Override
	public boolean updateM1(int id,int m1) {
		return stdDao.updateM1(id,m1);
	}

	@Override
	public boolean deleteById(int id) {
		return stdDao.removeById(id);
	}

	@Override
	public List<Student> sortByName() {
		return stdDao.sortByName();
	}

	@Override
	public List<Student> searchByM1(int m1) {
		return stdDao.findByM1(m1);
	}

	@Override
	public boolean deleteByM1(int m1) {
		return stdDao.deleteByM1(m1);
	}

	@Override
	public List<Student> sortByM1() {
		return stdDao.sortByM1();
	}

	@Override
	public List<Student> sortById() {
		return stdDao.sortByID();
	}

	@Override
	public List<Student> sortByAvegMarks() {
		return stdDao.sortByAvgMarks();
	}

}
