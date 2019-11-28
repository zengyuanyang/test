package com.mine.homework;

public class TicketThread implements Runnable{
	private int ticket = 100;
	private Object obj = new Object();
	@Override
	public void run() {
		while(true) {
			synchronized (obj) {
				if(ticket > 0) {
					
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					
					System.out.println(Thread.currentThread().getName() + "正在卖第" + (ticket--) + "张票！");
				}else {
					break;
				}
				
			}
		}
	}

}
