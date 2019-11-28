package com.mine.homework;

public class HomeWork1Main {

	public static void main(String[] args) {
		HomeWork1 hw = new HomeWork1();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 1;i <= 52;i++) {
					hw.printNum(i);
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = 65;i <= 90;i++) {
					hw.printChar(i);
				}
			}
		}).start();
	}

}
