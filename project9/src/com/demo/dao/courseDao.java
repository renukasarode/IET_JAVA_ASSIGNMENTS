package com.demo.dao;

import java.util.Map;
import java.util.Set;

public interface courseDao {

	boolean addNewCourse(String cName, int cap);

	Map<String, Integer> findAll();

	Integer findByCourseName(String name);

	boolean updateCapacity(String course, int cap);

	Set<String> findBycourseCapacity(int cap);

	boolean updateCourseName(String course, String uCourse);

	Map<String,Integer> displayInSortedOrder();

	Set<Map.Entry<String, Integer>> displayInSortedOrderofCapacity();

	boolean deleteByCourseName(String name);

	boolean removeByCapacity(int cap);
}
