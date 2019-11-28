package com.mine.homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * Socket测试(UDP协议，利用数据包发送数据)
 * @author 曾远洋
 * @time 2019年10月21日下午2:30:17
 * @version V1.0
 */
public class SocketTest {

	public static void main(String[] args) {
		
		//UDP协议发送数据
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//创建发送端Socket对象
				DatagramSocket ds = null;
				Scanner sc = null;
				try {
					//实例化发送端Socket对象
					ds = new DatagramSocket();
					//创建数据
					sc = new Scanner(System.in);
					System.out.println("请输入数据：");
					String str = sc.nextLine();
					byte[] by = str.getBytes();
					int length = by.length;
					//创建IP地址对象
					InetAddress address = InetAddress.getByName("192.168.2.144");
					//端口号
					int port = 10086;
					//创建数据包对象
					DatagramPacket dp = new DatagramPacket(by , length, address, port);
					//调用DatagramSockt的send方法，发送数据
					ds.send(dp);
				} catch (SocketException e) {
					e.printStackTrace();
				} catch (UnknownHostException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					//释放数据
					sc.close();
					ds.close();
					
				}
			}
		}).start();
		
		
		//UDP协议接收数据
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				//创建接收端socket对象
				DatagramSocket ds = null;
				try {
					//实例化接收端socket的对象
					ds = new DatagramSocket(10086);  //该构造函数，构造数据报套接字并将其绑定到本地主机上的指定端口
					//指定接收大小
					byte[] by = new byte[1024];
					int length = by.length;
					DatagramPacket dp = new DatagramPacket(by, length);
					//调用接收方法
					ds.receive(dp);
					//获取IP
					String ip = dp.getAddress().getHostAddress();
					String s = new String(dp.getData(), 0, dp.getLength());
					System.out.println(ip + "发送的数据是：" + s);
				} catch (SocketException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					//释放资源
					ds.close();
				}
			}
		}).start();
	}

}
