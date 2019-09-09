package com.homework;

import java.math.BigInteger;
import java.util.Scanner;

public class BinaryExchange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入一个十进制的正整数：");
		String decimal = sc.next();
		System.out.println("该数的二进制为：" + binary(decimal));
		System.out.println("该数的八进制为：" + octal(decimal));
		System.out.println("请你输入一个二进制数：");
		String binary = sc.next();
		System.out.println("该二进制对应的十进制为：" + decimal(binary));
	}
	
/**
 * 求二进制	
 * @param decimal	十进制字符串
 * @return	返回该数的二进制字符串
 */
	public static String binary(String decimal) {
		BigInteger bi = new BigInteger(decimal);
		BigInteger[] biArr = bi.divideAndRemainder(BigInteger.valueOf((long)2));
		String str = "";
		while((biArr[0] != BigInteger.valueOf((long)0)) || (biArr[1] != BigInteger.valueOf((long)0))){
			int i = biArr[0].intValue();
			int j = biArr[1].intValue();
			str = str + biArr[1];
			
			biArr = biArr[0].divideAndRemainder(BigInteger.valueOf((long)2));
		}
		StringBuffer sb = new StringBuffer(str);
		sb = sb.reverse();
		str = sb.toString();
		return str;
	}
	
	/**
	 * 求八进制
	 * @param decimal	十进制字符串
	 * @return		返回该数的八进制字符串
	 */
	public static String octal(String decimal) {
		BigInteger bi = new BigInteger(decimal);
		BigInteger[] biArr = bi.divideAndRemainder(BigInteger.valueOf((long)8));
		String str = "";
		while((biArr[0] != BigInteger.valueOf((long)0)) || (biArr[1] != BigInteger.valueOf((long)0))){
			int i = biArr[0].intValue();
			int j = biArr[1].intValue();
			str = str + biArr[1];
			
			biArr = biArr[0].divideAndRemainder(BigInteger.valueOf((long)8));
		}
		StringBuffer sb = new StringBuffer(str);
		sb = sb.reverse();
		str = sb.toString();
		return str;
	}
	
	/**
	 * 求二进制所对应的十进制
	 * @param binary	二进制字符串
	 * @return	返回十进制数
	 */
	public static int decimal(String binary) {
		byte[] arr = binary.getBytes();
		int de = 0;
		for(int i = 0;i < arr.length;i++) {
			de += Math.pow(2, arr.length-1-i)*(arr[i]-48);
		}
		return de;
	}
}
