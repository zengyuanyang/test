package com.mine.homework;

import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 在指定时间内删除指定目录
 * @author 曾远洋
 * @time 2019年10月17日下午5:46:15
 * @version V1.0
 */
public class DeleteFile {
	
	public static void main(String[] args) {
		Timer time = new Timer();
		time.schedule(new TimerTask() {
			File f = new File("C:\\Users\\Administrator\\Desktop\\test");
			@Override
			public void run() {
				File[] file = f.listFiles();
				if(file.length == 0) {
					f.delete();
				}else {
					for (File fi : file) {
						fi.delete();
					}
					f.delete();
				}
				time.cancel();
			}
		}, 5000);
	}

}
