package com.homework;
/**
 * 把数组中的数据按照指定个格式拼接成一个字符串
 * @author 曾远洋
 * @time 2019年9月3日下午6:04:34
 * @version V1.0
 */
public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		String str2 = "[";
		//循环先将每一个数组元素转为String类型，然后再进行拼接
		for(int i = 0;i < arr.length;i++) {		
			if(i == arr.length-1) {
				str2 = str2.concat(String.valueOf(arr[i]) + "]");	
			}else {
				str2 = str2.concat(String.valueOf(arr[i]) + ",");
			}
		}
		System.out.println(str2);
	}

}
