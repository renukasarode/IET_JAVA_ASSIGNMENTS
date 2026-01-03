package com.demo.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.demo.beans.MyClass;

public class TestMyClass {

	public static void main(String[] args) {
      MyClass cls =new MyClass(2,5);
     Class cs =  cls.getClass();
     Constructor[] cArr = cs.getConstructors();
      for(Constructor c :cArr)  
      {
    	  System.out.println(c.getName());
    	  System.out.println(c.getParameters());                                                                    
      }
      Method[] mArr = cs.getMethods();
      for(Method m :mArr)
      {
    	  System.out.println(m.getName());
    	  	if(m.getName().equals("m1"))
    	  	{
    	  		try {
					m.invoke(cls);
				} catch (IllegalAccessException e) {
//					e.printStackTrace();
					System.out.println(e.getMessage());
				} catch (IllegalArgumentException e) {
//					e.printStackTrace();
					System.out.println(e.getMessage());
				} catch (InvocationTargetException e) {
//					e.printStackTrace();
					System.out.println(e.getMessage());
				}
    	  	}
    	  Field[] fArr = cs.getDeclaredFields();
    	  for(Field f:fArr)
    	  {
    		  if(f.getName().equals("n1"))
    		  {
    		   System.out.println("in field array");
//    		    System.out.println(f.getName());
    		    f.setAccessible(false);
    		    System.out.println(f.getName());
    		  }
    	  }
    	  //setting the private member or field value
    	  
    	  try {
			Field f = cs.getDeclaredField("n1");
			System.out.println("before setting");
			System.out.println(f.getName());
			f.setAccessible(true);
		    f.set("n1", 2000); 
		    System.out.println("After setting value");
		    System.out.println(f.getName());
    	  } 
    	      catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			} catch (IllegalAccessException e) {
				System.out.println(e.getMessage());
			}
		     catch (NoSuchFieldException | SecurityException e) {
		    	 System.out.println(e.getMessage());
		} 
      }
	}
}
