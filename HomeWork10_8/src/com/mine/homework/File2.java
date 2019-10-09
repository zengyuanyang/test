package com.mine.homework;

import java.io.File;

/**
 * 2.找出e盘下所有后缀名为.jpg的文件，输出此文件的名称
 *
 * @author 杜婷
 * @time 2019年10月8日下午7:06:59
 * @version V1.0
 */
public class File2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f1= new File("F:\\");
		searchAll(f1);
	}
	public static void searchAll(File file) {
		File[] str=file.listFiles();
		for (File f : str) {
			if(f.isDirectory()) {
				searchAll(f);
			}else {
				if(f.getName().contains(".jpg")) {
					System.out.println(f);
				}
			}
		}
		
	}

}
