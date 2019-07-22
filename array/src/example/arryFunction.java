package example;

import java.util.Arrays;

/**
 * @version arrays类常用方法
 * @author 曾远洋
 *
 */
public class arryFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//比较两个数组是否相等
		int[] arr1 = new int[] {10,50,40,30};
		int[] arr2 = new int[] {10,50,40,30};
		int[] arr3 = new int[] {60,50,85};
		System.out.println(Arrays.equals(arr1, arr2)); //判断arr1和arr2的长度及元素是否相等
		System.out.println(Arrays.equals(arr1, arr3)); //判断arr1和arr3的长度及元素是否相等
		//对数组的元素进行升序排列
		int[][] array = new int[][] {{80,66},{70,54,98},{77,59}};
		for(int i = 0;i < array.length;i++) {
			Arrays.sort(array[i]);
			String banji = (i+1) + "班排序后的成绩：";
			System.out.println(banji);
			for(int j = 0;j < array[i].length;j++) {
				System.out.println(array[i][j]);
			}
		}
		//数组转换为字符串
		int[] str = new int[] {20,30,40,50};
		String Str = Arrays.toString(str);
		System.out.println(Str);
		//将数组所有元素赋值为相同的值
		int[] arr = new int[] {10,20,30,40};
		Arrays.fill(arr, 50);
		System.out.println(Arrays.toString(arr));
		//将数组复制成一个长度为设定值的新数组
		int[] arr4 = new int[] {10,20,30,40};
		int[] arr5 = Arrays.copyOf(arr4, 3);
		System.out.println(Arrays.toString(arr5));
		int[] arr6 = Arrays.copyOf(arr4, 4);
		System.out.println(Arrays.toString(arr6));
		int[] arr7 = Arrays.copyOf(arr4, 6);
		System.out.println(Arrays.toString(arr7));
		//查询元素在数组中的下标
		int index = Arrays.binarySearch(arr4, 10);
		System.out.println(index);
		index = Arrays.binarySearch(arr4, 40);
		System.out.println(index);
	}

}
