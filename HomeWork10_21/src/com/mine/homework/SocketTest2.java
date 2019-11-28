package com.mine.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * TCP协议传输数据
 * @author 曾远洋
 * @time 2019年10月21日下午4:18:06
 * @version V1.0
 */
public class SocketTest2 {

	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				Socket s = null;
				Scanner sc = new Scanner(System.in);
				try {
					s = new Socket("192.168.2.144", 10010);
					OutputStream os = s.getOutputStream();
					System.out.println("请输入数据：");
					String string = sc.nextLine();
					os.write(string.getBytes());
				} catch (UnknownHostException e) {
					e.printStackTrace();
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
			} 
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				ServerSocket ss = null;
				Socket s = null;
				OutputStream os = null;
				try {
					ss = new ServerSocket(10010);
					s = ss.accept();
					InputStream is = s.getInputStream();
					os = new FileOutputStream("duting.txt");
					byte[] by = new byte[1024];
					int len;
					String str = "";
					while((len = is.read(by)) != -1) {
						
						str = str + new String(by, 0, len);
						os.write(by, 0, len);
					}
					System.out.println(s.getInetAddress().getHostAddress()+ "发送的数据是：" + str);
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						os.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
					try {
						s.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
	}

}
