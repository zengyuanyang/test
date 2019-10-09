package com.kgc.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private GuessNumber() {}
	
	public static void start() {
		int number = new Random().nextInt(100)+1;
		
		int count = 0;
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入1-100的数字");
			String num = sc.nextLine();
			String regex = "([1-9][0-9]{0,1}|100)";
			if(!num.matches(regex)) {
				System.out.println("您输入的数字有误，请重新输入！");
				continue;
			}
			count++;
			if(Integer.parseInt(num) > number) {
				System.out.println("您输入的数字："+num+"大了");
				
			}else if(Integer.parseInt(num) < number) {
				System.out.println("您输入的数字："+num+"小了");
			}else {
				System.out.println("恭喜您，"+count+"猜中了！");
				break;
			}
		}
	}
}
