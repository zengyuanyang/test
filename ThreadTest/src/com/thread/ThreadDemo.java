package com.thread;
//继承创建线程
public class ThreadDemo extends Thread{
	public void run() {
		for(int i = 5;i >= 0 ;i--) {
			if(i < 5) {
				try {
					Thread.sleep(3000);		//睡眠3秒
					if(i == 4) {
						this.interrupt();	//中断sleep状态
					}
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				}
			}
			System.out.println("倒计时:" + i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadDemo().start();		//调用start方法启动线程
		
	}
	
}
