package com.mine.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/**
 * 
 * @author 曾远洋
 * @time 2019年10月10日下午4:32:29
 * @version V1.0
 */
public class WriterandReaderTest {

	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test.txt", true),"UTF-8");
		osw.write("我爱中国");
		osw.flush();
		osw.close();
	}
	
	/**
	 * 文件复制——普通字节流
	 * @param sourse	数据源
	 * @param target	目的地
	 * @throws IOException
	 */
	public static void copyFile(String sourse,String target) throws IOException {
		FileInputStream fis = new FileInputStream(sourse);
		FileOutputStream fos = new FileOutputStream(target);
		int by = 0;
		while((by = fis.read()) != -1) {
			fos.write(by);
		}
		fos.close();
		fis.close();
	}
	
	
	/**
	 * 文件复制——字节缓存流
	 * @param sourse	数据源
	 * @param target	目的地
	 * @throws IOException
	 */
	public static void copyFileBuffered(String sourse,String target) throws IOException {
		BufferedInputStream fis = new BufferedInputStream(new FileInputStream(sourse));
		BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(target));
		int by = 0;
		while((by = fis.read()) != -1) {
			fos.write(by);
		}
		fos.close();
		fis.close();
	}
	
	/**
	 * 文件复制——普通字符流
	 * @param sourse	数据源
	 * @param target	目的地
	 * @throws IOException
	 */
	public static void copyFileChar(String sourse,String target) throws IOException {
		OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream(sourse));
		InputStreamReader  is = new InputStreamReader(new FileInputStream(target));
		
		int by = 0;
		while((by = is.read()) != -1) {
			os.write((char)by);
		}
		os.close();
		is.close();
	}
	
	
	/**
	 * 文件复制——字符缓冲流
	 * @param sourse	数据源
	 * @param target	目的地
	 * @throws IOException
	 */
	public static void copyFileCharBuffered(String sourse,String target) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(sourse))) ;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(target)));
		String s = null;
		while((s = br.readLine()) != null) {
			bw.write(s);
			bw.newLine();
		}
		bw.close();
		br.close();
	}
}
