package com.mine.homework;

/**
 * 编写一个程序，启动三个线程，三个线程的名称分别是A,B,C；每个线程将自己的名称在屏幕上打印5遍；打印顺序为：ABCABCABCABCABC
 * @author 曾远洋
 * @time 2019年10月16日下午7:29:51
 * @version V1.0
 */
public class HomeWork2Main {

	public static void main(String[] args) {
		HomeWork2 hw = new HomeWork2();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0;i < 5;i++) {
					hw.printA();
				}
			}
		},"A").start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0;i < 5;i++) {
					hw.printB();
				}
			}
		},"B").start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0;i < 5;i++) {
					hw.printC();
				}
			}
		},"C").start();
	}
}
