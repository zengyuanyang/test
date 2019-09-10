package com.thread;


public class Ticket implements Runnable {
	private int count = 100;
	public Ticket() {
		// TODO Auto-generated constructor stub
	}
	public  void run() {
		while(count > 0) {
			synchronized(this) {
					if(count <= 0) {
						break;
					}else {
						try {
							Thread.sleep(2000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						count--;
						System.out.println(Thread.currentThread().getName() +"卖出1张，电影票还剩" + count + "张。");
					}
					
			}
		}
	}
}
