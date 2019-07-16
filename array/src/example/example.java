package example;

import java.util.Scanner;

/**
 * @version 第4章 数组示例
 * @author 曾远洋
 *
 */
public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] score = new int[5];
		System.out.println("请输入5门成绩：");
		//for循环为数组元素赋值
		for(int i = 0;i < score.length;i++) {
			score[i] = input.nextInt();
		}
		//常规for循环输出数组元素
		for(int i = 0;i < score.length;i++) {
			System.out.print(score[i] + " ");
		}
		System.out.println();
		//增强for循环输出数组元素
		for(int i : score) {
			System.out.print(i + " ");
		}
		input.close();
	}

}
