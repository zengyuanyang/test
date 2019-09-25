package com.my.list;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class ListTest {

	@Test
	public void input() {
		Scanner sc = new Scanner(System.in);	
		ArrayList<String> arrList1 = new ArrayList<String>();
		ArrayList<String> arrList2 = new ArrayList<String>();
		for(int i = 0;i < 10;i++) {
			System.out.println("请输入第" + (i+1) + "个数据：");
			String s = sc.next();
			arrList1.add(s);
		}
		for(int i = 0;i < arrList1.size();i++) {
			if(!exist((String)arrList1.get(i),arrList2)) {
				arrList2.add(arrList1.get(i));
			}
		}
		System.out.println("去重结果为：");
		for(int i = 0;i < arrList2.size();i++) {
			System.out.println(arrList2.get(i));
		}
		sc.close();
	}
	
	@Test
	public void string() {
		ArrayList<StringBuffer> al = new ArrayList<StringBuffer>();
		al.add(new StringBuffer("a"));
		al.add(new StringBuffer("ab"));
		al.add(new StringBuffer("abc"));
		al.add(new StringBuffer("abcd"));
		al.add(new StringBuffer("abcde"));
		al.add(new StringBuffer("abcdef"));
		
		for(int i = 0;i < al.size()-1;i++) {
			for(int l = i+1;l < al.size();l++) {
				StringBuffer s1 = al.get(i);
				StringBuffer s2 = al.get(l);
				for(int j = 0;j < s1.length();j++) {
					for(int k = 0;k < s2.length();k++) {
						if(s1.charAt(j) == s2.charAt(k)) {
							s2.deleteCharAt(k);
						}
					}
				}
			}
		}
		
		Iterator<StringBuffer> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	@Test
	public void sort() {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0;i < 5;i++) {
			System.out.println("请输入第" + (i+1) + "个数：");
			al.add(sc.nextInt());
		}
		//升序
		for(int j = 0; j < al.size()-1;j++) {
			for(int i = 0;i <al.size()-1-j;i++) {
				if(al.get(i) > al.get(i+1)) {
					int k = al.get(i);
					al.set(i, al.get(i+1));
					al.set(i+1, k);
				}
			}
		}
		
		for(int i = 0;i < al.size();i++) {
			System.out.println(al.get(i));
		}
		sc.close();
	}
	
	public boolean exist(String s,ArrayList<String> al) {
		boolean exist = false;
		for(int i = 0; i < al.size();i++) {
			if(al.get(i).equals(s)) {
				exist = true;
			}
		}
		return exist;
	}

}
