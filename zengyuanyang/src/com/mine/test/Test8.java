package com.mine.test;

import java.util.ArrayList;

//将两个集合{"a","b","c","d","e"}和{"d","e","f","g","h"}合并并去重
public class Test8 {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		list1.add("e");
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("d");
		list2.add("e");
		list2.add("f");
		list2.add("g");
		list2.add("h");
		addCollection(list1,list2);
	}

	private static void addCollection(ArrayList<String> list1, ArrayList<String> list2) {
		for (String s : list2) {	//遍历list2
			if(!list1.contains(s)) {	//判断list1中是否有当前元素
				list1.add(s);			//没有则添加至list1
			}
		}
		System.out.println(list1);		//输出list1
	}

}
