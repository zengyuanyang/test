package com.bytedemo;
/**
 * Byte包装类
 * @author 曾远洋
 * @time 2019年9月4日下午4:12:50
 * @version V1.0
 */
public class ByteDemo {
	/*
		Byte：是byte基本数据类型的包装类
		成员变量：
			static byte MAX_VALUE :byte的最大值
			static byte MIN_VALUE :byte的最小值
		构造方法：
			Byte(byte value) :已过时
			Byte(String s) :已过时
		成员方法：
			byte byteValue():将Byte的值转为byte
			static int compare(byte x,byte y):x<y 返回-1；x>y 返回1；x=y 返回0
			int compareTo(Byte anotherByte):当前Byte对象小于比较的Byte对象，返回-1；
											当前Byte对象大于比较的Byte对象，返回1；
											当前Byte对象等于比较的Byte对象，返回0.
			static int compareUnsigned(byte x,byte y):无符号(同为正或同为负)比较两个byte的值
			double doubleValue():将Byte转换为double类型
			boolean equals(Object object):比较两个对象的值是否相等
			float floatValue():转换为float类型
			int hashCode():返回这个Byte的哈希码，等于调用intValue()的结果
			static int haseCode(byte value):返回这个byte的哈希码,同上
			int intValue():转换为int类型
			long longValue():转换为long类型
			static byte parseByte(String s):将数字字符串转为byte类型
			short shortValue():转换成short类型
			String toString();将Byte的值转为String类型
			static String toString(byte b):将byte类型的转为String类型
			static int toUnsignedInt(byte x);转为无符号的int类型
			static Byte valueOf(byte b):将byte值赋给Byte实例
	*/
	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);	//输出byte的最大值
		System.out.println(Byte.MIN_VALUE);	//输出byte的最小值
		Byte b = new Byte("12");	//通过构造函数将数字字符串转为Byte类型
//		Byte b1 = new Byte("as");	//错误，只能是纯数字字符串
		System.out.println(b);
//		System.out.println(b1);
		byte b3 = 10;
		Byte b2 = new Byte(b3);	//通过构造方法赋值，注意参数为byte类型，不能填数字，因为数字是int类型
		System.out.println(b2);
		byte b4 = b2.byteValue();	//将b2的值转为byte
		System.out.println(b4);
		System.out.println("==================================");
		byte b5 = 12;
		byte b6 = 13;
		System.out.println(Byte.compare(b5, b6));	//-1
		System.out.println(Byte.compare(b6, b5));	//1
		System.out.println(Byte.compare(b5, b5));	//0
		System.out.println("==================================");
		Byte b7 = (byte)12;
		Byte b8 = (byte)13;
		System.out.println(b7.compareTo(b8));	//-1
		System.out.println(b8.compareTo(b7));	//1
		System.out.println(b8.compareTo(b8));	//0
		System.out.println("==================================");
		byte x = -12;
		byte y = -13;
		System.out.println(Byte.compareUnsigned(x,y));	 //-1
		System.out.println("==================================");
		Byte b9 = (byte)12;
		System.out.println(b9.doubleValue());	//12.0
		System.out.println("==================================");
		Byte b10 = (byte)13;
		Byte b11 = (byte)13;
		System.out.println(b10.equals(b11));	//true
		System.out.println("==================================");
		System.out.println(b10.hashCode());	//13
		System.out.println("==================================");
		System.out.println(Byte.parseByte("123"));
		System.out.println(Byte.toUnsignedInt((byte)-12));
		System.out.println(-12 & 0xFF);
		
	}	

}
