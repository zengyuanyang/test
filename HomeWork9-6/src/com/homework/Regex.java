package com.homework;

import java.util.Scanner;

/**
 * 正则表达式
 * @author 曾远洋
 * @time 2019年9月9日上午9:24:42
 * @version V1.0
 */
public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//验证身份证号码
		Scanner sc = new Scanner(System.in);
		String regex = "^[1-9][0-9]{5}([1][9][0-9]{2}|[2][0][01][0-9])([0][1-9]|[1][0-2])([0][1-9]|[12][0-9]|[3][01])\\d{3}[0-9X]";
		String str = sc.next();
		System.out.println(str.matches(regex));
	}

}
