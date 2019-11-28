package com.mine.homework;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.SequenceInputStream;
import java.util.ArrayList;

/**
 *  作业:
	1.用打印流复制文件信息
	2.把a,b文件夹的内容写到c文件中。
	3.传入任意个数的文件，将他们的内容合并。
	4.猜数字小游戏:
		- 注册。(账户密码写在文件中)(当然不能注册已存在的账户)
		- 查看排行榜(10个)
		- 开始游戏(10次机会)
		- 登录
 * @author 曾远洋
 * @time 2019年10月11日下午7:10:23
 * @version V1.0
 */
public class DataStream {
	static ArrayList<InputStream> list = new ArrayList<InputStream>();
	public static void main(String[] args) throws IOException {
		write();
		print();
		bingtwo();
		
		File f1 = new File("f1.txt");
		f1.createNewFile();
		list.add(new FileInputStream(f1));
		File f2 = new File("f2.txt");
		f2.createNewFile();
		list.add(new FileInputStream(f2));
		File f3 = new File("f3.txt");
		f3.createNewFile();
		list.add(new FileInputStream(f3));
		File f4 = new File("f4.txt");
		f4.createNewFile();
		list.add(new FileInputStream(f4));
		File f5 = new File("f5.txt");
		f5.createNewFile();
		list.add(new FileInputStream(f5));
		bingmore(list);
	}

	private static void write() throws IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("test.txt",true));
		dos.writeInt(Integer.MAX_VALUE);
		dos.close();
	}
	
	/**
	 * 用打印流复制文件信息
	 * @throws IOException
	 */
	private static void print() throws IOException {
		FileInputStream fis = new FileInputStream("print.txt");
		PrintStream ps = new PrintStream("printcopy.txt");
		int by = 0;
		while((by = fis.read()) != -1) {
			ps.write(by);
		}
		ps.close();
		fis.close();
	}
	
	
	/**
	 * 把a,b文件夹的内容写到c文件中
	 * @throws IOException
	 */
	public static void bingtwo() throws IOException {
		FileInputStream fis1 = new FileInputStream("bing1.txt");
		FileInputStream fis2 = new FileInputStream("bing2.txt");
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		FileOutputStream fos = new FileOutputStream("hebing.txt");
		byte[] by = new byte[1024];
		int len = 0;
		while((len = sis.read(by)) != -1) {
			fos.write(by, 0, len);
		}
		fos.close();
		sis.close();
		fis2.close();
		fis1.close();
	}
	
	/**
	 * 传入任意个数的文件，将他们的内容合并。
	 * @param arrlist
	 * @throws IOException
	 */
	public static void bingmore(ArrayList<InputStream> arrlist) throws IOException {
		if(arrlist.size() >= 2) {
			SequenceInputStream sis = new SequenceInputStream(arrlist.get(0), arrlist.get(1));
			arrlist.set(0, sis);
			arrlist.remove(1);
			list = arrlist;
			bingmore(list);
		}else {
			FileOutputStream fos = new FileOutputStream("hebing.txt");
			byte[] by = new byte[1024];
			int len = 0;
			while((len = arrlist.get(0).read(by)) != -1) {
				fos.write(by, 0, len);
			}
			
			fos.close();
		}
		
	}
}
