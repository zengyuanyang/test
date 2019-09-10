package com.thread;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ticket t = new Ticket();
		Thread t1 = new Thread(t,"天猫") ;
		Thread t2 = new Thread(t,"淘票票") ;
		Thread t3 = new Thread(t,"淘宝") ;
		t1.start();
		t2.start();
		t3.start();
	}

}
