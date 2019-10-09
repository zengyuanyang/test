package com.mine.homework;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节流读写文件、复制文件
 * @author 曾远洋
 * @time 2019年10月9日下午3:35:14
 * @version V1.0
 */
public class FileOutputStreamTest {

	
	public static void main(String[] args) throws IOException {
		//写文件
		try {
			FileOutputStream fos = new FileOutputStream("test.txt", false);
			try {
				fos.write("\t\t\t\t静夜诗\n".getBytes());
				fos.write("\t\t\t\t\t——李白\n".getBytes());
				fos.write("\t\t窗前明月光，疑似地上霜。\n".getBytes());
				fos.write("\t\t举头望明月，低头思故乡。\n".getBytes());
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		//读文件
		try {
			FileInputStream fis = new FileInputStream("test.txt");
			byte[] by = new byte[1024];			//一般数组大小为1024的整数倍
			int len = 0;
			try {
				while((len = fis.read(by)) != -1) {
					System.out.println(new String(by,0,len));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		//图片
		copyFile("F:\\我的\\生活\\照片\\1473803396_IMG_0261.JPG", "test.JPG");
		copyFileBuffered("F:\\我的\\生活\\照片\\1473803396_IMG_0261.JPG", "test2.JPG");
		
		//音频
		copyFile("F:\\我的\\工作\\团建\\2016团建\\特色支部答辩会\\新建文件夹\\群星-光荣啊,中国共青团.mp3", "test3.mp3");
		copyFileBuffered("F:\\我的\\工作\\团建\\2016团建\\特色支部答辩会\\新建文件夹\\群星-光荣啊,中国共青团.mp3", "test4.mp3");
		
		//视频
		copyFile("F:\\我的\\生活\\还念\\唱得巨难听的周大炮.mp4", "test5.mp4");
		copyFileBuffered("F:\\我的\\生活\\还念\\唱得巨难听的周大炮.mp4", "test6.mp4");
		
		//电子表格
		copyFile("C:\\Users\\Administrator\\Desktop\\2019-10-8每日作业检查情况 .xlsx", "test7.xlsx");
		copyFileBuffered("C:\\Users\\Administrator\\Desktop\\2019-10-8每日作业检查情况 .xlsx", "test8.xlsx");
	}
	
	/**
	 * 文件复制——普通
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
	 * 文件复制——普通
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
}
