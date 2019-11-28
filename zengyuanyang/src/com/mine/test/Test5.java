package com.mine.test;

import java.io.File;

//递归实现输入任意目录，列出文件以及文件夹
public class Test5 {

	public static void main(String[] args) {
		File f = new File("F:\\");
		searchAll(f);
	}
	
	public static void searchAll(File file) {
		if(file.getAbsolutePath().equals("F:\\System Volume Information")) {	//这是一个无访问权限的文件夹
			
		}else {
			File[] fileArray = file.listFiles();	//将文件夹下的文件和文件夹遍历到File类型的数组中
			for (File f : fileArray) {
				if(f.isFile()) {	//判断是否是文件
					System.out.println(f.getName());	//如果是文件就输出文件名
				}else {
					System.out.println(f.getAbsolutePath());	//如果是文件夹就输出文件夹的名字
					searchAll(f);								//递归回调
				}
			}
		}
	}

}
