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
			System.out.println("������1-100������");
			String num = sc.nextLine();
			String regex = "([1-9][0-9]{0,1}|100)";
			if(!num.matches(regex)) {
				System.out.println("������������������������룡");
				continue;
			}
			count++;
			if(Integer.parseInt(num) > number) {
				System.out.println("����������֣�"+num+"����");
				
			}else if(Integer.parseInt(num) < number) {
				System.out.println("����������֣�"+num+"С��");
			}else {
				System.out.println("��ϲ����"+count+"�����ˣ�");
				break;
			}
		}
	}
}
