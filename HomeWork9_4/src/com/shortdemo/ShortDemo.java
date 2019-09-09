package com.shortdemo;
/**
 * Short包装类
 * @author 曾远洋
 * @time 2019年9月4日下午6:00:36
 * @version V1.0
 */
public class ShortDemo {

	/*
		Short:short的包装类
		成员变量：
			static short MAX_VALUE :short的最大值
			static short MIN_VALUE :short的最小值
		构造方法：
			Short(byte value) :已过时
			Short(String s) :已过时
		成员方法：
			static short reverseBytes(short i):将i的二进制的补码，以字节（八位）为单位反转，然后将反转后的值返回，注意正负数的补码！
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Short.reverseBytes((short)-2));	//-257
		System.out.println(Short.reverseBytes((short)2)); 	//512
	}

}
