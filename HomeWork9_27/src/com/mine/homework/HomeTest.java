package com.mine.homework;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class HomeTest {

	public static void main(String[] args) {
//		TreeSet<Student> ts = new TreeSet<Student>();
//		ts.add(new Student("曾远洋",23));
//		ts.add(new Student("刀疤哥", 22));
		//获取10个1-20不重复的随机数
		TreeSet<Integer> ts = new TreeSet<Integer>();
		while(ts.size() < 10) {
			int rand = (int)(Math.random()*20+1);
			ts.add(rand);
		}
		System.out.println(ts);
		//键盘录入5个学生信息(姓名，语文成绩，数学成绩，英语成绩)，按照总分从高到低输出
		
		Set<StudentScore> ts2 = new TreeSet<StudentScore>();
		Scanner sc = new Scanner(System.in);
		StudentScore s;
		for(int i = 1;i <= 2 ;i++) {
			s = new StudentScore();
			System.out.println("请输入第" + i + "为学生的姓名：");
			s.setName(sc.next());
			System.out.println("请输入第" + i + "为学生的语文成绩：");
			s.setYw(sc.nextInt());
			System.out.println("请输入第" + i + "为学生的数学成绩：");
			s.setSx(sc.nextInt());
			System.out.println("请输入第" + i + "为学生的英语成绩：");
			s.setYy(sc.nextInt());
			s.setScore(s.getYw()+s.getSx()+s.getYy());
			ts2.add(s);
		}
		for (StudentScore ss : ts2) {
			System.out.println(ss);
		}
		sc.close();
	}

}
