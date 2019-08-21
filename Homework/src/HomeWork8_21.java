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
		/*
		reversed_order();	//调用reversed_order方法
        */
		/*
		sum_array();	//调用sum_array方法
        */	
		/*
		System.out.println("请输入杨辉三角的行数：");
		int h = sc.nextInt();
		pascal_triangle(h);	//调用Pascal_triangle方法
        */	
		
		System.out.println("请输入一串小于八位数的数据：");
		int mima = sc.nextInt();
		encryption(mima);	//调用encryption方法
		
	}
	
	
	
	//根据输入的索引值，返回字符串数组对应的元素
	public static void day(int i) {	
		String[] str = {"星期天","星期一","星期二","星期三","星期四","星期五","星期六"};
		System.out.println("对应元素为：" + str[i]);
	}
	
	
	
	//寻找值在数组中的对应位子
	public static void search(int i) {	
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
	
	
	
	//输出数组中的最大值和最小值
	public static void maxmin() {	
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
	
	
	
	//将数组逆序输出
	public static void reversed_order() {	
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
	
	
	
	//二维数组所有元素求和
	public static void sum_array() {
		int[][] sale = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int sum = 0;
		for(int i = 0;i < sale.length;i++) {
			for(int j = 0;j < sale[i].length;j++) {
				sum = sum + sale[i][j];
			}
		}
		System.out.println("本年度的销售额为：" + sum);
	}
	
	
	
	//输出杨辉三角（行数可键入）
	public static void pascal_triangle(int i) {
		int[][] array = new int[i][i];
		//将杨辉三角的数据录入二维数组
		array[0][0] = 1;
		for(int j = 1;j < array.length;j++) {
			array[j][0] = 1;
			for(int k = 1;k < array[j].length;k++) {
				array[j][k] = array[j-1][k] + array[j-1][k-1];
			}
		}
		//输出杨辉三角
		for(int j = 0;j < array.length;j++) {
			for(int k = 0;k < array[j].length;k++) {
				if(array[j][k] != 0) {//元素不为0时，输出元素值
					System.out.print(array[j][k]);
					System.out.print('\t');
				}
			}
			System.out.print('\n');	//每行输出结束后换行
		}
	}
	
	
	
	//数据加密
	public static void encryption(int mima) {
		int weishu = 0;
		int i = 1;
		//计算数据的位数
		while(1 == 1) {
			if(mima/i != 0) {
				weishu++;
				i *= 10;
			}else {
				break;
			}
		}
		if(weishu >= 8) {//判断当数据位数大于等于8位时，提示错误
			System.out.println("位数过多，请重新输入！");
			return;
		}
		System.out.println("该数据为：" + weishu + "位数。");
		int[] array = new int[weishu];	//定义数组
		int k = 1;
	    //将数据逆序存入数组
		for(int j = 0;j < weishu;j++) {
			array[j] = (mima/k)%10;
			k *= 10;
		}
		//对数据进行加密处理
		for(int j = 0;j < array.length;j++) {
			array[j] = (array[j] + 5) % 10;
		}
		//首尾数据互换
		k = array[0];
		array[0] = array[weishu-1];	
		array[weishu-1] = k;
		System.out.print("加密后的数据为：");
		for(int j = 0;j < array.length;j++) {	//遍历输出加密后的数据
			System.out.print(array[j]);
		}
	}
}
