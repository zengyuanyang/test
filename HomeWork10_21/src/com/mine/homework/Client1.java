package com.mine.homework;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			Socket s = new Socket("192.168.2.144",10010);
			OutputStream os = s.getOutputStream();
			System.out.println("请输入：");
			os.write(sc.next().getBytes());
		}
			
	}

}
