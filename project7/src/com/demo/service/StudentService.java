package com.demo.service;

import java.util.List;

import com.demo.beans.Student;

public interface StudentService {

	boolean addStudent();

	List<Student> displayAll();

	Student searchByID(int id);

	List<Student> searchByName(String name);

	boolean updateM1(int id, int m1);

	boolean deleteById(int id);

	List<Student> sortByName();

	List<Student> searchByM1(int m1);

	boolean deleteByM1(int m1);

	List<Student> sortByM1();

	List<Student> sortById();

	List<Student> sortByAvegMarks();

}
