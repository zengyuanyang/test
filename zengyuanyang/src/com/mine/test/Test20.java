package com.mine.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 采用两种方式实现输出如下格式的当前日期时间
 */
public class Test20 {
    public static void main(String[] args) {
        System.out.println("使用Date获取当前时间:");
       showDate();
        System.out.println("使用Calendar获取当前时间:");
       showCalender();

    }
    //使用Date获取当前时间
    public static  void showDate(){
        Date date =new Date();
        String format="yyyy年MM月dd日  HH:mm:ss";
        SimpleDateFormat sdf=new SimpleDateFormat(format);
        String dateString =sdf.format(date);
        System.out.println(dateString);
    }
    //使用Calender
    public static void showCalender(){
        Calendar calendar=Calendar.getInstance();
        StringBuilder sb =new StringBuilder();
        sb.append(calendar.get(Calendar.YEAR)).append("年")
                .append(calendar.get(Calendar.MONTH)).append("月")
                .append(calendar.get(Calendar.DAY_OF_MONTH)).append("日")
                .append(calendar.get(Calendar.HOUR_OF_DAY)).append("时")
                .append(calendar.get(Calendar.MINUTE)).append("分")
                .append(calendar.get(Calendar.SECOND)).append("秒");
        System.out.println(sb.toString());
    }
}
