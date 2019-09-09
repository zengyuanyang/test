package com.homework;

import java.util.Scanner;

/**
 * 判断一个字符串是否是对称字符串
 * @author 曾远洋
 * @time 2019年9月4日下午2:14:09
 * @version V1.0
 */
public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入判断的字符串：");
		String str = sc.next();
		StringBuffer sb = new StringBuffer(str);	//将string转为StringBuffer，调用reverse方法
		sb = sb.reverse();
		String str2 = sb.toString();	//将StringBuffer转为String，调用equals方法判断反转前后的值是否相等
		if(str2.equals(str)) {
			System.out.println("是反转字符串！");
		}else {
			System.out.println("不是反转字符串！");
		}
		
	}

}
