package com.characterdemo;
/**
 * Character包装类
 * @author 曾远洋
 * @time 2019年9月4日下午10:34:03
 * @version V1.0
 */
public class CharacterDemo {
	/*
		Character:char的包装类
		成员方法：
			char charValue():返回Character对象的值
			static int codePointAt(char[] a,int index):返回字符数组指定位置字符的ASCII码
			int hashCode():返回Character对象的哈希码（其实相当于值的ASCII码）
			static boolean isAlphabetic(int codePoint):判断codePoint对应的字符是不是字母表
			static boolean isDigit(char ch):判断是否是数字
			static boolean isLetter(char ch/int codePoint):判断是否是一个字母
			static boolean isLowerCase(char ch):判断是否是小写字母
			static boolean idUpperCase(char ch):判断是否是大写字母
			static char toLowerCase(Char ch):转成小写
			static char toUpperCase(Char ch):转成小写
			
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.charCount(111250));
		Character c = new Character('a');
		System.out.println(c.charValue());
		char[] ch = {'a','b','c'};
		System.out.println(Character.codePointAt(ch, 1));
		System.out.println(Character.getName(98));
		System.out.println(Character.getNumericValue('a'));
		System.out.println(Character.getType('a'));
		System.out.println(c.hashCode());
		System.out.println(Character.isAlphabetic(97));
		System.out.println(Character.isDigit('9'));
	}

}
