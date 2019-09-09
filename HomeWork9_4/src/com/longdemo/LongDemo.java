package com.longdemo;
/**
 * Long包装类
 * @author 曾远洋
 * @time 2019年9月4日下午6:51:52
 * @version V1.0
 */
public class LongDemo {
	/*
		Long:long的包装类
		成员变量：
			static long MAX_VALUE :long的最大值
			static long MIN_VALUE :long的最小值
		成员方法：
			static int bitCount(long l):返回l(64位)二进制补码中1的个数
			static Long decode(String nm):将String(纯数字)解码为Long
			static long highestOneBit(long i):将i二进制中最高位（最左边的1）对应的值返回
			static long lowestOneBit(long i):将i二进制中最低位（最右边的1）对应的值返回
			static long max​(long a, long b)：返回最大值
			static long min(long a, long b)：返回最小值
			static long sum​(long a, long b)：求和
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Long.bitCount(1));	//1
		System.out.println(Long.bitCount(2));	//1
		System.out.println(Long.bitCount(3));	//2
		System.out.println(Long.bitCount(15));	//3
		System.out.println(Long.bitCount(-1));	//64
		System.out.println(Long.bitCount(-2));	//63
		System.out.println(Long.bitCount(-3));	//63
		System.out.println("===============================");
		System.out.println(Long.decode("123"));	//123
		System.out.println(Long.getLong("123"));	//NULL
		System.out.println(Long.highestOneBit(129));	//128
		System.out.println(Long.lowestOneBit(128));
//		System.out.println(Long.decode("adf"));
	}

}
