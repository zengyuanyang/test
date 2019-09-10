package com.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//创建文件
		File f = new File("C:\\Users\\Administrator\\Desktop","test.txt");
		if(!f.exists()) {
			f.createNewFile();
		}
		
		System.out.println(f.exists());
		//删除文件
		if(f.exists()) {
			f.delete();
		}
		System.out.println(f.exists());
		//不区分大小写
		File f2 = new File("C:\\Users\\Administrator\\Desktop","Test.txt");
		if(!f2.exists()) {
			f.createNewFile();
		}
		//字节流文件读写
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\text1.txt");
		byte[] arr = {97,8,13};
		fos.write(arr,0,arr.length);
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\text1.txt");
		int data;
		while((data = fis.read()) != -1) {
			System.out.print(data + " ");
		}
		fos.close();
		fis.close();
		//字符流文件读写
		File ff = new File("C:\\Users\\Administrator\\Desktop\\text2.txt");	//创建File对象
		if(!ff.exists()) {
			ff.createNewFile();		//创建文件
		}
		FileWriter fw = new FileWriter(ff);		//通过File对象创建FileWriter对象
		BufferedWriter bw = new BufferedWriter(fw);		//通过FileWriter对象创建BufferedWriter对象
		bw.newLine();		//新建一行
		bw.write("hello");	//输入hello
		bw.flush();			//刷新流
		fw.close();			
		bw.close();
		FileReader fr = new FileReader(ff);		//通过File对象创建FileReader对象
		BufferedReader bf = new BufferedReader(fr);		//通过FileReader对象创建BufferedWriter对象
		String line = bf.readLine();
		while(line != null) {
			System.out.println(line);
			line = bf.readLine();
		}
		fr.close();
		bf.close();
		//运行可执行文件.exe
		Runtime rt = Runtime.getRuntime();
		//rt.exec("D:\\QQyouxi\\QQGame\\QQGame.exe");
		
		File file = new File("F:\\eclipse_workspace\\IoTest\\src\\com\\file\\FileDemo.java");
		File file2 = new File("C:\\Users\\Administrator\\Desktop\\text3.txt");
		if(!file2.exists()) {
			file2.createNewFile();
		}
		FileInputStream fis1 = new FileInputStream(file);
		FileOutputStream fos1 = new FileOutputStream(file2);
		int c;
		while((c = fis1.read()) != -1) {
			System.out.print((char)c);
			fos1.write((char)c);
		}
		fis1.close();
		fos1.close();
	}

}
