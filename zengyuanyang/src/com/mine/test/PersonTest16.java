package com.mine.test;

public class PersonTest16 {
	private String name;
	private int age;
	public PersonTest16() {
		super();	
	}
	public PersonTest16(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "," + age ;
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		PersonTest16 p=(PersonTest16) obj;
		return this.name.equals(p.name);
	}
}