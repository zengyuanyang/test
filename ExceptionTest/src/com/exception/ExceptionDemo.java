package com.exception;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test2();
		try {
			test1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void test1() throws Exception {
		int i = 5;
		int j = 0;
		if(j == 0) {
			throw new Exception("分母不能为0");
		}
		
		
	}
	
	public static void test2() {
		int i = 5;
		int j = 0;
		try {
			int k = i/j;
		}catch(Exception e) {
			System.out.println("错误！");
		}
	}
}
