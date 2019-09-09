package com.homework;

import java.util.Scanner;

/**
 * 统计大串中小串出现的次数
 * @author 曾远洋
 * @time 2019年9月3日下午6:50:17
 * @version V1.0
 */
public class CountStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个大字符串：");
		String bgs = sc.nextLine();
		System.out.println("请输入一个要查找的小字符串：");
		String sms = sc.nextLine();
		int count = 0;	//包含个数
		int index = -1;	
		while(true) {
			index = bgs.indexOf(sms, index+1);
			if(index < 0) {
				break;
			}else {
				count++;
			}
		}
		System.out.println("包含" + count + "个！");
	}

}
