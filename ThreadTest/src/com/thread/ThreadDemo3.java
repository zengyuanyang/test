package com.thread;
//内部类的方式创建线程
public class ThreadDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {		//匿名内部类，在Tread实例中重写run()方法
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
		}.start();
		
		new Thread(new Runnable() {	//匿名内部类，在Runnable实例中重写run()方法
			public void run() {
				for(int i = 0;i < 100 ;i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("thread");
				}
			}
		}).start();
	}

}
