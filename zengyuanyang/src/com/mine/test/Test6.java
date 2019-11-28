package com.mine.test;

import java.io.File;

//递归实现列出当前工程下所有.java文件
public class Test6 {

	public static void main(String[] args) {
		File f = new File("./");
		checkAll(f);
	}

	public static void checkAll(File file) {
		File[] fileArray = file.listFiles();	//将当前file文件夹下的文件及文件夹遍历存储到File数组中
		for (File f : fileArray) {				//遍历该数组
			if(f.isFile()) {					//判断是否是文件
				if(f.getName().contains(".java")) {		//如果是文件，继续判断文件名是否包含.java字符串
					System.out.println(f.getName());	//如果包含就输出文件名
				}	
			}else {
				checkAll(f);							//否则回调方法
			}
		}
	}
}
