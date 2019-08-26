import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 从控制台输入一个正整数，计算该数的阶乘。例如输入5，阶乘为 5*4*3*2*1
 */
public class Exam8_Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int i = sc.nextInt();
		System.out.print(i + "的阶乘为");
		for(int j = i;j > 0;j--) {
			if(j != 1) {
				System.out.print(j + "*");
			}else {
				System.out.print(j);
			}
		}
	}

}
