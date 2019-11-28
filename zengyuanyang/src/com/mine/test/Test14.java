package com.mine.test;

import java.util.ArrayList;
//已知User类，该类有name（String类型）和age（int类型）
//两个属性，ArrayList<User>排序，要求按照User对象的age的倒序排序。
public class Test14 {
	public static void main(String[] args) {
		//创建集合 添加User对象
		ArrayList<UserTest14> list=new ArrayList<UserTest14>();
		list.add(new UserTest14("a", 25));
		list.add(new UserTest14("c", 234));
		list.add(new UserTest14("d", 325));
		list.add(new UserTest14("e", 123));
		sort(list);
	}
	private static void sort(ArrayList<UserTest14> a) {
		//循环遍历排序
		for (int i=0;i<a.size()-1;i++) {
			for (int j=i+1;j<a.size();j++) {
				if(a.get(i).getAge()<a.get(j).getAge()){
					UserTest14 s=a.get(i);
					a.set(i, a.get(j));
					a.set(j, s);
				}
			}
		}
		System.out.println(a);
	}
}
