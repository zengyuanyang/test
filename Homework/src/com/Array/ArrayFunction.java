package com.Array;


/**
 * 操作数组的相关方法
 * @author 曾远洋
 * @version v1.0
 * 
 */
public class ArrayFunction {

	private ArrayFunction() {	//构造方法前加private，将其封装在该类中，只能通过类名.方法调用
		
	}
	
	/**
	 * 遍历数组，将数组按[元素1，元素2，元素3，...]格式输出
	 * @param arr 需要遍历输出的数组
	 * 
	 */
	public static void arrayTraversal(int[] arr) {
		System.out.print("[");
		for(int i = 0;i < arr.length;i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i] + "]" + '\n');
			}else {
				System.out.print(arr[i] + ",");
			}
		}
	}
	
	/**
	 * 查找数组的最大值
	 * @param arr	查找最大值的数组
	 * @return	max  该数组的最大值
	 */
	public static int arrayMax(int[] arr) {
		int max = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 * 查找数组的最小值
	 * @param arr 查找最小值的数组
	 * @return min  该数组的最小值
	 */
	public static int arrayMin(int[] arr) {
		int min = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	/**
	 * 查找一个数在数组中索引值
	 * @param arr	数据所在的数组
	 * @param a 被查找的数
	 * @return 该数在数组中的索引值
	 */
	public static int arrayIndex(int[] arr,int a) {
		int i;
		for(i = 0;i < arr.length;i++) {
			if(arr[i] == a) {
				break;
			}
		}
		return i;
	}
	
	/**
	 * 将一个数组逆序输出
	 * @param arr	将要逆序的数组
	 */
	public static void arrayReversedOrder(int[] arr) {
		for(int i = 0;i < arr.length/2;i++) {
			int k;
			k = arr[i];
			arr[i] = arr[arr.length-1-i];
			 arr[arr.length-1-i] = k;
		}
		arrayTraversal(arr);	//调用遍历方法
	}
}
