package com.mine.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 模拟用户登陆功能实现。接收用户输入的用户名和密码，然后和文件中存储的用户名、密码匹配
 */
public class Test11 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("请输入用户名");
		Scanner sc = new Scanner(System.in);
		String userName = sc.nextLine();
		System.out.println("请输入密码");
		String userPwd = sc.nextLine();
		
		regist(userName,userPwd);
		
		
		System.out.println("请输入验证登陆用户名");
		String uName = sc.nextLine();
		System.out.println("请输入验证登陆密码");
		String uPwd = sc.nextLine();
		login(uName,uPwd);
		
	}
	//登陆
	public static boolean login(String userName,String userPwd) throws IOException {
		boolean flag = false;
		BufferedReader br = new BufferedReader(new FileReader("c.txt"));
		String str = null;
		while((str = br.readLine())!=null) {
			String[] str1 = str.split("=");
			if(str1[0].equals(userName) && str1[1].equals(userPwd)) {
				flag = true;
				System.out.println("登陆成功");
				break;
			}
		}
		br.close();
		return flag;
	}
	//注册
	public static void regist(String userName,String userPwd) throws IOException {
		String str = userName+"="+userPwd;
		BufferedWriter br = new BufferedWriter(new FileWriter("c.txt"));
		br.write(str);
		br.newLine();
		br.flush();
		br.close();
		System.out.println("注册成功");
	}
}
