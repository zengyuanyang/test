package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateTools类，包含Date对象常用操作
 * @author 曾远洋
 * @time 2019年9月6日下午12:48:07
 * @version V1.0
 */
public class DateTools {

	private DateTools() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 将Date类型转为指定格式的字符串
	 * @param pattern	指定的格式
	 * @param date		date数据
	 * @return			返回指定格式的字符串
	 */
	public static String dateToString(String pattern,Date date) {
		
		return new SimpleDateFormat(pattern).format(date);
	}
	
	/**
	 * 将String类型的日期转为Date类型
	 * @param pattern	指定格式
	 * @param date		String类型的日期
	 * @return			返回一个Date类型
	 * @throws ParseException	抛出异常
	 */
	public static Date stringToDate(String pattern,String date) throws ParseException {
		return new SimpleDateFormat(pattern).parse(date);
	}
	
	/**
	 * 返回两时间的差值，以毫秒为单位
	 * @param date1		string类型的时间1
	 * @param date2		string类型的时间2
	 * @param pattern	指定时间格式
	 * @return			返回时间差
	 * @throws ParseException	抛出异常
	 */
	public static long dateSubtract(String date1,String date2,String pattern) throws ParseException {
		
		return Math.abs(stringToDate(pattern,date1).getTime() - stringToDate(pattern,date2).getTime());
	}
	
	/**
	 * 返回两时间的和，以毫秒为单位
	 * @param date1		string类型的时间1
	 * @param date2		string类型的时间2
	 * @param pattern	指定时间格式
	 * @return			返回时间和
	 * @throws ParseException	抛出异常
	 */
	public static long dateAdd(String date1,String date2,String pattern) throws ParseException {
		
		return stringToDate(pattern,date1).getTime() + stringToDate(pattern,date2).getTime();
	}
	
	/**
	 * 比较两个时间
	 * @param date1		string类型的时间1
	 * @param date2		string类型的时间2
	 * @param pattern	指定时间格式
	 * @return			若date1>date2,返回1；若date1=date2，返回0；若date1<date2,返回-1
	 * @throws ParseException		抛出异常
	 */
	public static int comparaDate(String date1,String date2,String pattern) throws ParseException {
		int re = 1;
		if(stringToDate(pattern,date1).getTime() > stringToDate(pattern,date2).getTime()) {
		}else if(stringToDate(pattern,date1).getTime() == stringToDate(pattern,date2).getTime()){
			re = 0;
		}else {
			re = -1;
		}
		return re;
	}

}
