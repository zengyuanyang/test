package com.mine.homework;

public class HomeWork2 {
	
	private int flag = 1;
	private int count = 0;
	
	public synchronized void printA() {
		while(flag != 1) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.print(Thread.currentThread().getName());
		flag = 2;
		count += count;
		this.notifyAll();
	}
	
	public synchronized void printB() {
		while(flag != 2) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.print(Thread.currentThread().getName());
		flag = 3;
		count++;
		this.notifyAll();
	}
	
	public synchronized void printC() {
		while(flag != 3) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(Thread.currentThread().getName());
		flag = 1;
		count++;
		this.notifyAll();
	}
}
