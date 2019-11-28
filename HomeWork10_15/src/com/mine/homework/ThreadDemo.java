package com.mine.homework;

public class ThreadDemo extends Thread{
	private int ticket = 100;
	private Object obj = new Object();
	public ThreadDemo() {
		super();
	}
	public ThreadDemo(String name) {
		super(name);
	}
	@Override
	public void run() {
		synchronized (obj) {
			while(ticket > 0) {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "正在卖第" + (ticket--) + "张票！");
			}
		}
	}
}
