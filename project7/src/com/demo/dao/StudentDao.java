package com.demo.dao;

import java.util.List;

import com.demo.beans.Student;

public interface StudentDao {

	boolean saveStudent(Student std);

	List<Student> findAll();

	Student findByID(int id);

	List<Student> findByName(String name);

	boolean updateM1(int id, int m1);

	boolean removeById(int id);

	List<Student> sortByName();

	List<Student> findByM1(int m1);

	boolean deleteByM1(int m1);

	List<Student> sortByM1();

	List<Student> sortByID();

	List<Student> sortByAvgMarks();

}
