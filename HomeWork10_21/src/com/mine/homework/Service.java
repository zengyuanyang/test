package com.mine.homework;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(10010);
		while(true) {
			Socket s = ss.accept();
			new Thread(new ServerRunnable(s)).start();
		}
	}
}
