package com.mine.homework;
/**
 * 写两个线程，一个线程打印1-52，另一个线程打印A-Z；打印顺序为：12A34B56C…5152Z
 * @author 曾远洋
 * @time 2019年10月16日下午7:02:40
 * @version V1.0
 */
public class HomeWork1 {
	private int count = 0;
	private boolean flag = true;
	public synchronized void printNum(int i) {
		while(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print(i);
		if(count % 3 == 1) {
			flag = false;
		}
		count++;
		this.notify();
	}
	
	public synchronized void printChar(int i) {
		while(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print((char)i);
		flag = true;
		count++;
		this.notify();
	}
}
