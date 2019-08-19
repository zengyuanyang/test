/**
 * @author 曾远洋
 * @version 求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制
 */
import java.lang.Math;
import java.util.Scanner;
public class Program8_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入相加的项数：");
		int xs = sc.nextInt();
		System.out.println("请输入a的值：");
		int a = sc.nextInt();
		for(int i = 0;i < xs;i++) {
			sum =  sum + (int)(Math.pow(10, (xs-i-1)))*a*(i+1);
		}
		System.out.println("和为：" + sum);
		sc.close();
	}

}
