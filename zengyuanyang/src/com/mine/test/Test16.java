package com.mine.test;

import java.util.HashSet;
import java.util.Iterator;

public class Test16 {
	public static void main(String[] args) {
		HashSet<PersonTest16> hashSet=new HashSet<PersonTest16>();
		hashSet.add(new PersonTest16("a", 23));
		hashSet.add(new PersonTest16("a", 35));
		hashSet.add(new PersonTest16("b", 45));
		hashSet.add(new PersonTest16("b", 24));
		hashSet.add(new PersonTest16("c", 34));
		hashSet.add(new PersonTest16("c", 43));
		//增强for遍历输出
		for (PersonTest16 person : hashSet) {
			System.out.println(person);
		}
		System.out.println("---------------------------");
		//迭代器遍历输出
		Iterator<PersonTest16> it =hashSet.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

