package com.demo.dao;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class courseDaoImple implements courseDao {
	static Map<String,Integer> hm = new HashMap<>();
	static
	{
		hm.put("DAC", 240);
		hm.put("DBDA",65);
		hm.put("DTISS",60);
	}
	

	@Override
	public boolean addNewCourse(String cName, int cap) {
		if(!hm.containsKey(cName))
		{
			hm.put(cName, cap);
			return true;
		}
		return false;
	}


	@Override
	public Map<String, Integer> findAll() {
		return hm;
	}


	@Override
	public Integer findByCourseName(String name) {
		if(hm.containsKey(name))
		{
			return hm.get(name);
	}
		return -1;
}


	@Override
	public boolean updateCapacity(String course, int cap) {
		if(hm.containsKey(course))
		{
		hm.put(course, cap);
		return true;
		}
		return false;
	}


	@Override
	public Set<String> findBycourseCapacity(int cap) {
		Set<String> newSet = new HashSet<>();
	    for(String key:hm.keySet())
	    {
	    	if(hm.get(key)==cap)
	    	{
	    		
	    		newSet.add(key);
	    	}
	    }
		return newSet;
	}

	@Override
	public boolean updateCourseName(String course,String uCourse) {
		if(hm.containsKey(course))
		{
			int cap=hm.remove(course);
			hm.put(uCourse, cap);
			return true;
		}
		return false;
	}

	@Override
	public Map<String,Integer> displayInSortedOrder() {
		return new TreeMap<>(hm); 
	}

	@Override
	public Set<Map.Entry<String, Integer>> displayInSortedOrderofCapacity() {
	   Set<Map.Entry<String, Integer>> entSet = hm.entrySet();
	   Comparator<Map.Entry<String, Integer>> cmp = (o1,o2)->{
		 return o1.getValue()-o2.getValue();  
	   };
	   Set<Map.Entry<String, Integer>> tSet = new TreeSet<>(cmp);
	   for(Map.Entry<String, Integer> mp :entSet)
	   {
		   tSet.add(mp);
	   }
	   return tSet;
	}

	@Override
	public boolean deleteByCourseName(String name) {
		return null!=hm.remove(name);
	}


	@Override
	public boolean removeByCapacity(int cap) {
		Set<Map.Entry<String, Integer>> ent = hm.entrySet();
		int cnt=0;
//		for(Map.Entry<String, Integer> mp:ent)
//		{
//			if(cap==mp.getValue())
//			{
//				hm.remove(mp.getKey());
//				cnt++;
//			}
//		}
		Iterator<Map.Entry<String, Integer>> it = ent.iterator();
		while(it.hasNext())
		{
			if(cap==it.next().getValue())
				{
					it.remove();
					cnt++;
				}
		}
		if(cnt>0)
		{
			return true;
		}
		return false;
	}
}
