package com.mine.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 把指定目录下（包含子目录）的所有图片，复制到另一个指定目录下
 */
public class Test10 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要复制的文件夹路径");
		String srcFileName = sc.nextLine();
		System.out.println("请输入复制到的目录路径");
		String destFileName = sc.nextLine();
		
		File srcFile = new File("srcFileName");
		File dtFile = new File("destFileName");
		
		String srcFolerName = srcFile.getName();
		File destFile = new File(dtFile,srcFolerName);
		destFile.mkdirs();
		
		method(srcFile,destFile);
			
	}
	public static void method(File srcFile,File destFile) throws IOException {
		File[] files = srcFile.listFiles();
		
		if(files==null) {
			return;
		}
		for (File f : files) {//如果是文件夹久创建
			if(f.isDirectory()) {
				File destZiFile = new File(destFile,f.getName());
				destZiFile.mkdir();
				method(f,destZiFile);
			}
			else {
				if(f.getName().endsWith(".jpg")) {//如果是图片就复制
					File destFile2 = new File(destFile,f.getName());
					copy(f,destFile2);
				}
				
			}
		}
	}
	public static void copy(File f,File copyF) throws IOException {
		FileInputStream fis = new FileInputStream(f);
		FileOutputStream fos = new FileOutputStream(copyF);
		
		byte[] by = new byte[1024];
		int len = 0;
		while((len = fis.read(by)) != -1) {
			fos.write(by, 0, len);
		}
		fis.close();
		fos.close();
	
	}
}
