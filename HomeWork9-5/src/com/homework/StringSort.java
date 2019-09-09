package com.homework;

import java.util.Scanner;

/**
 * 将字符串中的字符按字典顺序排序输出
 * @author 曾远洋
 * @time 2019年9月5日上午10:42:34
 * @version V1.0
 */
public class StringSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String str = sc.next();
		char[] arr = str.toCharArray();
		for(int j = 0; j < arr.length-1;j++) {
			for(int i = 0;i < arr.length-1-j;i++) {
				if(arr[i] > arr[i+1]) {
					char k = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = k;
				}
			}
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
