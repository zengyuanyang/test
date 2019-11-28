package com.mine.homework;

public class Print {
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
		System.out.print("A");
		if(count % 4 == 0) {
			flag = 1;
		}else {
			
			flag = 2;
		}
		count++;
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
		System.out.print("B");
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
		System.out.println("C");
		flag = 1;
		count++;
		this.notifyAll();
	}
}
