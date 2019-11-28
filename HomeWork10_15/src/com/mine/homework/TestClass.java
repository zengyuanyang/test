package com.mine.homework;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestClass implements Runnable{
	int time = 0;
	SimpleDateFormat m = new SimpleDateFormat("hh:mm:ss");
	Date date;
	@Override
	public void run() {
		while(true) {
			date = new Date();
			System.out.println(m.format(date) + "..." + Thread.currentThread().getName());
			time++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			if(time == 3) {
				Thread thread = Thread.currentThread();
				thread = new Thread(this,"线程2");
				thread.start();
			}
		}
	}

}
