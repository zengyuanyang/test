import java.util.Scanner;
/**
 * 
 * @author 曾远洋
 * @version 输入三个整数x,y,z，请把这三个数由小到大输出
 */
public class Program15_Order2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第 1个数：");
		int a = sc.nextInt();
		System.out.println("请输入第 2个数：");
		int b = sc.nextInt();
		System.out.println("请输入第 3个数：");
		int c = sc.nextInt();
		if(a > b) {
			int k;
			k = a;
			a = b;
			b = k;
		}
		if(a > c) {
			int k;
			k = a;
			a = c;
			c = k;
		}
		if(b > c) {
			int k;
			k = b;
			b = c;
			c = k;
		}
		System.out.print(a + " " + b + " " +c);
	}

}
