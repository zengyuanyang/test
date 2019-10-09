package com.mine.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * HashMap嵌套，添加元素遍历
 * 		HashMap<String,HashMap<String,String>>
 * 		ArrayList<HashMap<String,String>>
 * 		HashMap<String,ArrayList<String,String>>
 * 键盘录入字符串，次数不限，统计每一个字符串中a-Z出现的次数
 * @author 曾远洋
 * @time 2019年9月29日下午12:13:04
 * @version V1.0
 */
public class MapTest {

	public static void main(String[] args) {
		//Map嵌套Map
		HashMap<String,HashMap<String,String>> mm = new HashMap<String, HashMap<String,String>>();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("曾远洋", "刀疤哥");
		map.put("刁叶超","阿刁");
		map.put("李犇", "李三牛");
		mm.put("一班", map);
		mm.put("二班", map);
		mm.put("三班", map);
		for (Map.Entry<String, HashMap<String,String>> setmap : mm.entrySet()) {
			for(Map.Entry<String, String> m : setmap.getValue().entrySet()) {
				System.out.println(m);
			}
		}
		System.out.println("----------------------------------------");
		//List嵌套Map
		ArrayList<HashMap<String,String>> lm = new ArrayList<HashMap<String,String>>();
 		lm.add(map);
 		lm.add(map);
 		lm.add(map);
 		for (HashMap<String, String> hashMap : lm) {
			for(Map.Entry<String, String> m : hashMap.entrySet()) {
				System.out.println(m);
			}
		}
 		System.out.println("----------------------------------------");
		//Map嵌套List
 		HashMap<String,ArrayList<String>> ml = new HashMap<String, ArrayList<String>>();
 		ArrayList<String> arrList = new ArrayList<String>();
 		arrList.add("曾远洋");
 		arrList.add("李犇");
 		arrList.add("刁叶超");
 		ml.put("一班", arrList);
 		ml.put("二班", arrList);
 		ml.put("三班", arrList);
 		for(Map.Entry<String, ArrayList<String>> m : ml.entrySet()) {
 			for (String s : m.getValue()) {
				System.out.println(s);
			}
 		}
 		
 		System.out.println("----------------------------------------");
 		//键盘录入字符串，次数不限，统计每一个字符串中a-Z出现的次数
 		Scanner sc = new Scanner(System.in);
 		HashMap<Character,Integer> hashmap = new HashMap<Character, Integer>();
 		System.out.println("请输入一个字符串：");
 		String str = sc.nextLine();
 		for(int i = 0;i < str.length();i++) {
 			if(!hashmap.containsKey(str.charAt(i))) {
 				hashmap.put(str.charAt(i), 1);
 			}else{
 				hashmap.put(str.charAt(i), hashmap.get(str.charAt(i))+1);
 			}
 		}
 		
 		for(Map.Entry<Character, Integer> m : hashmap.entrySet()) {
 			System.out.println(m);
 		}
 		sc.close();
	}

}
