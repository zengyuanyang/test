package com.mine.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//在C盘下有篇txt文本，读取这个文本并统计出这个文本中指定字符的个数（如指定字符“我”），将该字符
//与对应的次数输出到当前项目的key.txt中，例如：输出格式为：我=10
public class Test12 {

	static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) throws IOException {
			ArrayList<Character> list=new ArrayList<Character>();
			File file=new File("C:\\Users\\Administrator\\Desktop\\b.txt");
			BufferedReader br=new BufferedReader(new FileReader(file));
			char[] charr = new char[1024];
			int len = 0;
			while((len=br.read(charr)) != -1){
				for (char c : charr) {
					System.out.println(c);
					list.add(c);
					
				}
			}
			br.close();
			int count=0;
			for (Character c : list) {
				if(c=='我'){
					count++;
				}
			}
			String line="我="+count;
			BufferedWriter bw=new BufferedWriter(new FileWriter("key.txt"));
			bw.write(line);
			bw.close();
		}
	}
