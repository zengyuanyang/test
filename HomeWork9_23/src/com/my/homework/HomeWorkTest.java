package com.my.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class HomeWorkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection c = new ArrayList();
		Student s1 = new Student("曾远洋",23);
		Student s2 = new Student("张三", 22);
		Student s3 = new Student("李四", 21);
		Student s4 = new Student("王五", 20);
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		Iterator i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("---------------------------------------");
		List<String> list = new ArrayList<String>();
		list.add("hellow");
		list.add("world");
		list.add("thank");
		list.add("you");
		addJavaEE(list);
		for(int i1 = 0;i1 < list.size();i1++) {
			System.out.println(list.get(i1));
		}
	}
	
	/**
	 * 判断是否有world，有则添加JavaEE
	 * @param list	列表
	 */
	public static void addJavaEE(List<String> list) {
		for(int i = 0;i < list.size(); i++) {
			if(list.get(i).equals("world")) {
				list.add(i+1, "JavaEE");
			}
		}
	}

}
