package com.thread;
//实现接口方式实现线程
public class ThreadDemo2 implements Runnable{
	public void run() {
		for(int i = 0;i < 100 ;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Thread");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread(new ThreadDemo2()).start();
		for(int i = 0;i < 100 ;i++) {
			System.out.println("thread");
		}
	}

}
