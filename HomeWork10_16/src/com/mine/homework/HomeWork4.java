package com.mine.homework;

public class HomeWork4 {
	private boolean flag = true;
	private int tortle = 0;
	private int rubbit = 0;
	public synchronized void tortleRun() {
		while(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		tortle += 5;
		System.out.println(Thread.currentThread().getName() + "跑了" + tortle + "米。");
		flag = false;
		this.notify();
		
	}
	
	public synchronized void rubbitRun() {
		while(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		rubbit += 10;
		System.out.println(Thread.currentThread().getName() + "跑了" + rubbit + "米。");
		flag = true;
		this.notify();
		
	}

	public int getTortle() {
		return tortle;
	}

	public void setTortle(int tortle) {
		this.tortle = tortle;
	}

	public int getRubbit() {
		return rubbit;
	}

	public void setRubbit(int rubbit) {
		this.rubbit = rubbit;
	}
	
	
}
