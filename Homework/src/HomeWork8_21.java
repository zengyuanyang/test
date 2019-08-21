import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 8月21日作业
 */
public class HomeWork8_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("请输入一个索引值：");
		int i = sc.nextInt();
		day(i);	//调用方法day
		*/		
		/*
		System.out.println("请输入一个数：");
		int j = sc.nextInt();
		search(j);	//调用search方法
        */		
		/*
		maxmin();	//调用maxmin方法
        */	
		reversed_order();	//调用reversed_order方法
		}
	public static void day(int i) {	//根据输入的索引值，返回字符串数组对应的元素
		String[] str = {"星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
		System.out.println("对应元素为：" + str[i]);
	}
	public static void search(int i) {	//寻找值在数组中的对应位子
		int[] array = {1,3,6,12,8,6,9};
		int count = 0;
		for(int j = 0;j < array.length;j++) {
			if(array[j] == i) {	//判断元素与输入值是否相等
				System.out.println("该数在数组中的位子是：" + (j+1));
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("数组中没有该数据！");
		}
	}
	public static void maxmin() {	//输出数组中的最大值和最小值
		int[] array = {2,8,13,6,22,64,1,24};
		int max = array[0];
		int min = array[0];
		for(int i = 0;i < array.length;i++) {
			if(array[i] >= max) {	//将元素与max进行比较，如果大于等于max，就将该元素的值赋给max
				max = array[i];
			}
			if(array[i] <= min) {	//将元素与min进行比较，如果小于等于min，就将该元素的值赋给min
				min = array[i];
			}
		}
		System.out.println("该数组最大值为：" + max + "，最小值为：" + min);
	}
	public static void reversed_order() {	//将数组逆序输出
		int[] array = {1,3,8,9,14,16,5};
		System.out.print("数组正序输出为：[");
		
		for(int i = 0;i < array.length;i++) {	//遍历输出正序数组
			if(i == array.length-1) {
				System.out.print(array[i] + "]");
			}else {
				System.out.print(array[i] + ",");
			}
		}
		for(int i = 0;i < array.length/2;i++) {	//将数组逆序
			int j;
			j = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = j;
		}
		System.out.print('\n');
		System.out.print("数组逆序输出为：[");
		for(int i = 0;i < array.length;i++) {	//遍历输出逆序的数组
			if(i == array.length-1) {
				System.out.print(array[i] + "]");
			}else {
				System.out.print(array[i] + ",");
			}
		}
		
	}
}
