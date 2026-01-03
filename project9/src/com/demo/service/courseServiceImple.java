package com.demo.service;

import com.demo.dao.courseDao;
import com.demo.dao.courseDaoImple;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class courseServiceImple implements courseService {
	private courseDao cDao=null;
	public courseServiceImple()
	{
	  cDao = new courseDaoImple();
	}

	@Override
	public boolean addNewCourse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of the course");
		String cName = sc.next();
		System.out.println("enterthe value of the capacity");
		int cap = sc.nextInt();
		return cDao.addNewCourse(cName,cap);
	}

	@Override
	public Map<String, Integer> displayAll() {
		return cDao.findAll();
	}

	@Override
	public Integer FindByCourseName(String name) {
		return cDao.findByCourseName(name);
	}

	@Override
	public boolean modifyCapacity(String course, int cap) {
		return cDao.updateCapacity(course,cap);
	}

	@Override
	public Set<String> FindByCourseCapacity(int cap) {
		return cDao.findBycourseCapacity(cap);
	}

	@Override
	public boolean modifyCourseName(String course,String uCourse) {
		return cDao.updateCourseName(course,uCourse);
	}

	@Override
	public Map<String,Integer> displayInSortedOrder() {
		return cDao.displayInSortedOrder();
	}

	@Override
	public Set<Map.Entry<String, Integer>> displayInSortedOrderofCapacity() {
		
		return cDao.displayInSortedOrderofCapacity();
	}

	@Override
	public boolean deleteByCourseName(String name) {
		return cDao.deleteByCourseName(name);
	}

	@Override
	public boolean DeleteByCapacity(int cap) {
		return cDao.removeByCapacity(cap);
	}

}
