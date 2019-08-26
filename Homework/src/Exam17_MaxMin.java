import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 输入一批整数，使用循环求出最大值与最小值，输入0时结束
 */
public class Exam17_MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		int min;
		System.out.println("请输入第1个数：");
		int input = sc.nextInt();
		max = input;
		min = input;
		for(int i = 2;1 == 1;i++) {
			System.out.println("请输入第" + i + "个数：");
			input = sc.nextInt();
			if(input == 0) {
				break;
			}
			if(input > max) {
				max = input;
			}
			if(input < min) {
				min = input;
			}
			
		}
		System.out.println("最大值为：" + max + "，最小值为：" + min);
	}

}
