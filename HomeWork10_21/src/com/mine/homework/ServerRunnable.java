package com.mine.homework;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerRunnable implements Runnable {
	private Socket s;
	public ServerRunnable(Socket s) {
		this.s = s;
	}
	@Override
	public void run() {
			try {
				InputStream is = s.getInputStream();
				byte[] by = new byte[1024];
				int len = is.read(by);
				if(len != -1) {
					String str = new String(by, 0, len);
					System.out.println(s.getInetAddress().getHostAddress() + "发送的信息是：" + "(" + new SimpleDateFormat("hh:mm:ss").format(new Date()) + ")" + str);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}finally {
				
			}
		}
}
