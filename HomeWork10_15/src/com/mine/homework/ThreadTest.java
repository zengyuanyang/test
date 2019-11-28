package com.mine.homework;

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {
		ThreadDemo ticket1 = new ThreadDemo("窗口1");
		ThreadDemo ticket2 = new ThreadDemo("窗口2");
		ThreadDemo ticket3 = new ThreadDemo("窗口3");
		ticket1.start();
		ticket2.start();
		ticket3.start();
	}

}
