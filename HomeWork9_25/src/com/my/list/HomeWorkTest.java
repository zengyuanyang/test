package com.my.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;


public class HomeWorkTest {

	public static void main(String[] args) {
		Collection<Student> c = new ArrayList<Student>();
		Student s1 = new Student("曾远洋",23);
		Student s2 = new Student("张三", 22);
		Student s3 = new Student("李四", 21);
		Student s4 = new Student("王五", 20);
		c.add(s1);
		c.add(s2);
		c.add(s3);
		c.add(s4);
		Iterator<Student> i = c.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("--------------------------------");
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("增强for循环遍历--------------------------------");
		for(Student s : list) {
			System.out.println(s);
		}
		System.out.println("迭代器遍历--------------------------------");
		ListIterator<Student> lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("--------------------------------");
		System.out.println("字符串类型————————————————");
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("world");
		al.add("Java");
		ListIterator<String> lit2 = al.listIterator();
		while(lit2.hasNext()) {
			System.out.println(lit2.next());
		}
		System.out.println("自定义类型————————————————");
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s1);
		al2.add(s2);
		al2.add(s3);
		al2.add(s4);
		ListIterator<Student> lit3 = al2.listIterator();
		while(lit3.hasNext()) {
			System.out.println(lit3.next());
		}
		System.out.println("--------------------------------");
		System.out.println("字符串类型————————————————");
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hello");
		ll.add("world");
		ll.add("Java");
		ListIterator<String> lit4 = ll.listIterator();
		while(lit4.hasNext()) {
			System.out.println(lit4.next());
		}
		System.out.println("自定义类型————————————————");
		LinkedList<Student> ll2 = new LinkedList<Student>();
		ll2.add(s1);
		ll2.add(s2);
		ll2.add(s3);
		ll2.add(s4);
		ListIterator<Student> lit5 = ll2.listIterator();
		while(lit5.hasNext()) {
			System.out.println(lit5.next());
		}
		System.out.println("--------------------------------");
		/*
		我们班有学生，每一个学生是不是一个对象。所以我们可以使用一个集合表示我们班级的学生。ArrayList<Student>
		 * 		但是呢，我们旁边是不是还有班级，每个班级是不是也是一个ArrayList<Student>。
		 * 		而我现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
		*/
		System.out.println("学生班级————————————————————");
		ArrayList<Student> class1 = new ArrayList<Student>();
		class1.add(new Student("刀疤哥", 18));
		class1.add(new Student("刀疤姐", 18));
		ArrayList<Student> class2 = new ArrayList<Student>();
		class2.add(new Student("猪八戒", 25));
		class2.add(new Student("孙悟空", 2500));
		ArrayList<Student> class3 = new ArrayList<Student>();
		class3.add(new Student("玉皇大帝", 3600));
		class3.add(new Student("王母娘娘", 3000));
		ArrayList<ArrayList<Student>> arrlist = new ArrayList<ArrayList<Student>>();
		arrlist.add(class1);
		arrlist.add(class2);
		arrlist.add(class3);
		for(int i1 = 0;i1 < arrlist.size();i1++) {
			for(int j = 0;j < arrlist.get(i1).size();j++) {
				System.out.println(arrlist.get(i1).get(j));
			}
		}
		System.out.println("--------------------------------");
		/*
		获取10个1-20之间的随机数，要求不能重复
		 * 用数组实现，但是数组的长度是固定的，长度不好确定。
		 * 所以我们使用集合实现。
		*/
		System.out.println("随机数——————————————————————————");
		int count = 0;
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		while(count < 10) {
			int n = 0;
			int rand = (int) (Math.random()*20 + 1);
			for(int m = 0;m < arrayList.size();m++) {
				if(arrayList.get(m) == rand) {
					n++;
				}
			}
			if(n == 0) {
				arrayList.add(rand);
				count++;
			}
		}
		ListIterator<Integer> lit6 = arrayList.listIterator();
		System.out.print("十个随机数为：[");
		while(lit6.hasNext()) {
			System.out.print(lit6.next() + "  ");
		}
		System.out.println("]");
		System.out.println("--------------------------------");
		/*
		键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
		*/
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> listInt = new ArrayList<Integer>();
		int count2 = 1;
		while(true) {
			System.out.println("请输入第" + count2 + "个数据(输入0结束)：");
			int num = sc.nextInt();
			if(num != 0) {
				listInt.add(num);
				count2++;
			}else {
				break;
			}
		}
		
		int max = listInt.get(0);
		for(int n = 0;n <listInt.size();n++) {
			if(listInt.get(n) > max) {
				max = listInt.get(n);
			}
		}
		System.out.println("输入的最大值为：" + max);
		sc.close();
	}

}
