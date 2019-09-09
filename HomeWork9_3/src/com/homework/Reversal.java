package com.homework;

import java.util.Scanner;

/**
 * 字符串反转
 * @author 曾远洋
 * @time 2019年9月3日下午6:40:26
 * @version V1.0
 */
public class Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sc.nextLine();
		System.out.print("该字符串反转输出为：");
		for(int i = str.length()-1;i >=0;i--) {
			System.out.print(str.charAt(i));	//通过charAt()方法逆序输出
		}
	}

}
