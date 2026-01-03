package com.demo.beans;

public class Student implements Comparable<Student>{
	private int id;
	private String name;
	private int m1;
	private int m2;
	public Student() {
		super();
	}
	public Student(int id, String name, int m1, int m2) {
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
	}
	public Student(int id2) {
		this.id = id2;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
    public float getAvg()
    {
    	return ((m1+m2)/2.0f);
    }
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + "]";
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", getAvg()=" + getAvg() + "]";
	}
	@Override
	public boolean equals(Object obj) {
		return this.id==((Student)obj).id;
	}
	@Override
	public int compareTo(Student o) {
		return id-o.getId();
	}
}
