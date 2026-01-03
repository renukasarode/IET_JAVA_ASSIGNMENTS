package com.demo.service;

import java.util.Map;
import java.util.Set;

public interface courseService {

	boolean addNewCourse();
	Map<String, Integer> displayAll();
	Integer FindByCourseName(String name);
	boolean modifyCapacity(String course, int cap);
	Set<String> FindByCourseCapacity(int cap);
	boolean modifyCourseName(String course, String uCourse);
	Map<String,Integer> displayInSortedOrder();
	Set<Map.Entry<String, Integer>> displayInSortedOrderofCapacity();
	boolean deleteByCourseName(String name);
	boolean DeleteByCapacity(int cap);
}
