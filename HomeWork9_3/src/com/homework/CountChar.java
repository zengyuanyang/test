package com.homework;

import java.util.Scanner;
/**
 * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * @author 曾远洋
 * @time 2019年9月3日下午6:02:00
 * @version V1.0
 */
public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sc.nextLine();
		int lower = 0;
		int upper = 0;
		int num = 0;
		char[] ch = str.toCharArray();
		for(char c : ch) {	//增强循环
			if(c >= 48 && c <= 57) {	//利用ASCII值判断数字
				num++;
			}else if(c >= 65 && c <= 90) {	//利用ASCII值判断大写字母
				upper++;
			}else if(c >= 97 && c <= 122) {		//利用ASCII值判断小写字母
				lower++;
			}
		}
		System.out.println("该字符串中大写字母" + upper + "个，小写字母" + lower + "个，数字" + num + "个！");
	}

}
