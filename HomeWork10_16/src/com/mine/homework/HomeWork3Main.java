package com.mine.homework;

/**
 * 打印AABB两个线程
 * @author 曾远洋
 * @time 2019年10月16日下午7:31:24
 * @version V1.0
 */
public class HomeWork3Main {

	public static void main(String[] args) {
		HomeWork3 hw = new HomeWork3();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 6; i++) {
					hw.printA();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i < 6; i++) {
					hw.printB();
				}
			}
		}).start();
	}

}
