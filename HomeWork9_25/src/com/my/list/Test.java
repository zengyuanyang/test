package com.my.list;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(11);
		System.out.println(list.get(0).getClass());
		System.out.println(list2.get(0).getClass());
	}
}
