package com.mine.homework;

import java.io.File;
import java.util.Scanner;

/**
 * 作业：
 * 	1.遍历一个盘符里的所有文件
 * 	2.找出一个盘符下所有后缀名为.jpg的文件，并输出此文件的名称
 * 	3.编写一个方法，用户可以修改任意文件夹下的任意文件或文件夹名
 * @author 曾远洋
 * @time 2019年10月8日下午5:50:26
 * @version V1.0
 */
public class FileTest {
	static int count = 0;
	public static void main(String[] args) {
		File file = new File("F:\\");
		//searchAll(file);
		checkAll(file);
	}
	
	/**
	 *  遍历一个盘符里的所有文件
	 * @param file
	 */
	public static void searchAll(File file) {
		if(file.getAbsolutePath().equals("F:\\System Volume Information")) {
			
		}else {
			File[] fileArray = file.listFiles();
			for (File f : fileArray) {
				if(f.isFile()) {
					System.out.println(f.getName());
					count++;
				}else {
					searchAll(f);
				}
			}
			System.out.println(count);
		}
	}
	
	
	/**
	 * 找出一个盘符下所有后缀名为.jpg的文件，并输出此文件的名称
	 * @param file
	 */
	public static void checkAll(File file) {
		if(file.getAbsolutePath().equals("F:\\System Volume Information")) {
			
		}else {
			File[] fileArray = file.listFiles();
			for (File f : fileArray) {
				if(f.isFile()) {
					if(f.getName().contains(".jpg")) {
						System.out.println(f.getName());
					}
				}else {
					checkAll(f);
				}
			}
		}
	}
	
	public static void changeName() {
		Scanner sc = new Scanner(System.in);
	}
}
