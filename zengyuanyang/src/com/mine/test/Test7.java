package com.mine.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//从磁盘读取一个文件到内存中，再打印到控制台
public class Test7 {

	public static void main(String[] args) throws IOException {
		File f = new File("test7.txt");
		readFile(f);
	}
	
	public static void readFile(File file) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));		//创建字符缓冲流对象
		int len = 0;
		while((len = br.read()) != -1) {	//遍历文件中的字符
			System.out.print((char)len);	//输出字符到控制台
		}
		br.close();							//关闭流
	}	
	
}
