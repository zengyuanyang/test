package com.mine.homework;

public class TicketTest {

	public static void main(String[] args) {
		TicketThread tt = new TicketThread();
		Thread t1 = new Thread(tt, "窗口1");
		Thread t2 = new Thread(tt, "窗口2");
		Thread t3 = new Thread(tt, "窗口3");
		t1.start();
		t2.start();
		t3.start();
	}
}
