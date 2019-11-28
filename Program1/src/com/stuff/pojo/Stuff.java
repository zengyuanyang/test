package com.stuff.pojo;

import java.io.Serializable;

public class Stuff implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3200324985721624935L;
	private String name;
	private String age;
	private String phone;
	private String zhiwei;
	public Stuff() {
	}
	public Stuff(String name, String age, String phone, String zhiwei) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.zhiwei = zhiwei;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getZhiwei() {
		return zhiwei;
	}
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	@Override
	public String toString() {
		return "name=" + name + ", age=" + age + ", phone=" + phone + ", zhiwei=" + zhiwei ;
	}
	
}
