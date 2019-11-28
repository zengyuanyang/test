package com.mine.homework;

public class TestPrint {

	public static void main(String[] args) {
		Print print = new Print();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0;i < 10;i++) {
					print.printA();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0;i < 5;i++) {
					print.printB();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 0;i < 5;i++) {
					print.printC();
				}
			}
		}).start();
	}

}
