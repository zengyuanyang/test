package com.booleandemo;
/**
 * Boolean包装类
 * @author 曾远洋
 * @time 2019年9月4日下午8:25:10
 * @version V1.0
 */
public class BooleanDemo {
	/*
		static boolean logicalAnd(boolean a,boolean b):与操作
		static boolean logicalOr(boolean a,boolean b):或操作
		static boolean logicalXor(boolean a,boolean b):异或操作
		static boolean parseBoolean​(String s):s不为null且为“true”时返回true，否则返回false
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Boolean.logicalAnd(false, true));
		System.out.println(Boolean.logicalOr(false, true));
		System.out.println(Boolean.logicalXor(false, true));
		System.out.println(Boolean.logicalXor(false, false));
		System.out.println(Boolean.logicalXor(true, true));
		System.out.println(Boolean.parseBoolean("asdfs"));
	}

}
