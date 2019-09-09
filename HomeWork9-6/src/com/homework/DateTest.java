package com.homework;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.date.DateTools;

/**
 * 
 * @author 曾远洋
 * @time 2019年9月6日上午11:35:44
 * @version V1.0
 */
public class DateTest {

	public static void main(String[] args) throws ParseException {
		
		birthDay();
		hour();
		
		
	}
	//出生至今多少天
	public static void birthDay() {
		Scanner sc =new Scanner(System.in);
		String pattern = "yyyy-MM-dd";
		System.out.println("请按照 " + pattern + " 格式输入您的出身日期：");
		String birthdate = sc.next();
		Date d = new Date();
		try {
			d = DateTools.stringToDate(pattern, birthdate);
			long birth = d.getTime();
			long current = System.currentTimeMillis();
			int day = (int)((current - birth)/(1000*60*60*24));
			System.out.println("您出生至今" + day + "天！");
		} catch (ParseException e) {
			System.out.println("您输入的格式有误，请重新输入！");
			birthDay();
		}
	}
	
	//到现在多少小时
	public static void hour() {
		Scanner sc =new Scanner(System.in);
		String pattern = "yyyy-MM-dd HH:mm:ss";
		System.out.println("请按照 " + pattern + " 格式输入一个时间：");
		String birthdate = sc.nextLine();
		Date d = new Date();
		try {
			d = DateTools.stringToDate(pattern, birthdate);
			long input = d.getTime();
			long now = System.currentTimeMillis();
			int hour = Math.abs((int)((input - now)/(1000*60*60)));
			System.out.println("至现在" + hour + "小时！");
		} catch (ParseException e) {
			System.out.println("您输入的格式有误，请重新输入！");
			hour();
		}
	}

}
