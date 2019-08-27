import java.util.Scanner;

import com.Array.ArrayFunction;

public class HomeWork8_26 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		ArrayFunction.arrayTraversal(arr);	//遍历数组
		System.out.println(ArrayFunction.arrayMax(arr));	//输出数组中的最大值
		System.out.println(ArrayFunction.arrayMin(arr));	//输出数组中的最小值
		System.out.println(ArrayFunction.arrayIndex(arr, 5));	//索引值查找
		ArrayFunction.arrayReversedOrder(arr); //逆序输出
		//100个随机数的最大值和最小值
		int[] array = new int[100];
		for(int i = 0;i < 100;i++) {
			array[i] = (int)(Math.random()*100+1);
		}
		System.out.println(ArrayFunction.arrayMax(array));	
		System.out.println(ArrayFunction.arrayMin(array));	
		ArrayFunction.arrayReversedOrder(array);
		
		//猜数字游戏
		Scanner sc = new Scanner(System.in);
		int r = (int)(Math.random()*100+1);	//创建随机数
		int count = 0;	//用于累计错误次数
		while(true) {
			System.out.println("请输入1——100的整数，您还有" + (3-count) + "次机会!");
			if(sc.hasNextInt()) {	//通过hasNextInt（）方法判断输入的值是否是整数
				int i = sc.nextInt();
				if(r == i) {
					System.out.println("恭喜您答对了！");
				}else if(r > i) {
					System.out.println("您的答案小了！");
					count++;
					if(count == 3) {	//判断当错误次数为三时结束游戏并给出正确答案
						System.out.println("三次均答错，游戏结束！正确答案为：" + r);
						System.exit(0);
					}
				}else {
					System.out.println("您的答案大了！");
					count++;
					if(count == 3) {
						System.out.println("三次均答错，游戏结束！正确答案为：" + r);
						System.exit(0);
					}
				}
				
			}else {	//输入不为整数时给出提示
				System.out.println("输入错误，请重新输入！");
				String flag = sc.next();
			}
		}
		
	}

}
