package com.mine.homework;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SocketFunction {
	private boolean flag = true;
	public synchronized void client1() {
		if(!flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Socket s = null;
		Scanner sc = null;
		try {
			s = new Socket("192.168.2.144",10010);
			OutputStream os = s.getOutputStream();
			sc = new Scanner(System.in);
			System.out.println("请输入：");
			os.write(sc.nextLine().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			sc.close();
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		flag = false;
		this.notifyAll();
	}
	
	public synchronized void client2() {
		if(flag) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Socket s = null;
		Scanner sc = null;
		try {
			s = new Socket("192.168.2.144",10010);
			OutputStream os = s.getOutputStream();
			sc = new Scanner(System.in);
			System.out.println("请输入：");
			os.write(sc.nextLine().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			sc.close();
			try {
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		flag = true;
		this.notifyAll();
	}
}
