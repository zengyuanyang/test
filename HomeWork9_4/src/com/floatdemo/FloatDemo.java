package com.floatdemo;
/**
 * Float包装类
 * @author 曾远洋
 * @time 2019年9月4日下午7:42:26
 * @version V1.0
 */
public class FloatDemo {

	/*
	 	Float：float的包装了类
		成员变量：
			static int MAX_EXPONENT：返回最大指数
			static int MIN_EXPONENT：返回最小指数
			static float MAX_VALUE：返回最大数
			static float MIN_VALUE：返回最小数
			static float MIN_NORMAL：常数保持类型为float的最小正常值，2 -126 
			static float NaN:非数字值的常数
			static float NEGATIVE_INFINITY：负无穷大
			static float POSITIVE_INFINITY：正无穷大
		成员方法：
			static boolean isFinite​(float f)：判断浮点值是否有限，是则返回true，否则返回false，NaN返回false
			boolean isInfinite​()：判断浮点是否无限大
			static boolean isInfinite​(float v)：判断浮点是否无限大
			boolean isNaN​()：判断是否是非数字
			static boolean isNaN​(float v)：判断是否是非数字
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Float.MAX_EXPONENT);
		System.out.println(Float.MIN_EXPONENT);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MIN_NORMAL);
		System.out.println(Float.NaN);
		System.out.println(Float.floatToIntBits((float)12.1314));
		Float f = new Float((float)12.1314);
		System.out.println(f.hashCode());
		System.out.println(Float.intBitsToFloat(2));
		System.out.println(Float.isFinite(Float.POSITIVE_INFINITY));
		System.out.println(Float.isFinite(Float.NaN));
		System.out.println(Float.isFinite((float)12.1314));
		
	}

}
