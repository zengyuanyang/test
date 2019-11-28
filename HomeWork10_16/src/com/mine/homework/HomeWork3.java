package com.mine.homework;

public class HomeWork3 {
	private int count = 0;
	private boolean flag = true;
	public synchronized void printA() {
		while(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("A");
		if(count % 4 == 1) {
			flag = false;
		}
		count++;
		this.notify();
	}
	
	public synchronized void printB() {
		while(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.print("B");
		if(count % 4 == 3) {
			flag = true;
		}
		count++;
		this.notify();
	}
}
