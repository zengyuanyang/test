package com.homework;

import java.io.Serializable;

public class Peopel implements Serializable{
	private String name;
	private boolean sex;
	private int age;
	public Peopel() {
		// TODO Auto-generated constructor stub
	}
	public Peopel(String name,boolean sex,int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String toString() {
		String str;
		if(this.sex == true) {
			str = "姓名：" + this.name + "\t性别：男" + "\t年龄：" + this.age;
		}else {
			str = "姓名：" + this.name + "\t性别：女" + "\t年龄：" + this.age;
		}
		return str;	
	}

}
