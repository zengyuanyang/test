package com.my.list;

public class Student {
	private int age;
	private String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + "  " + age;
	}
}