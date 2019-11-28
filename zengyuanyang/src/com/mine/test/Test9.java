package com.mine.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

/*
 *   已知文件a.txt文件中的内容为"AAbcdea22dferwplkCC321ou1"，请编写程序读取该文件的内容，要求去掉重复字母（区分大小写）
 *   并按照自然排序顺序后输出到b.txt文件中。即b.txt文件内容应为"abc....123.."这样的顺序输出
 */
public class Test9 {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("b.txt");
		FileReader fr = new FileReader("a.txt");
		
		TreeSet<Character> ts = new TreeSet<Character>();
		
		int ch = 0;
		while((ch = fr.read()) != -1) {
			ts.add((char)ch);
		}
		fr.close();
		
		char[] chararr = new char[ts.size()];
		
		int i = 0;
		for(Character s : ts) {
			chararr[i] = s;
			i++;
		}
		TreeSet<Character> ts1 = new TreeSet<Character>();
		
		for (char c : chararr) {
			ts1.add(c);
		}
		System.out.println(ts1);
		for (Character c : ts1) {
			fw.write(c);
		}
		
		fw.close();
	}

}
