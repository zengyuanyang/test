import java.util.Scanner;
/**
 * 
 * @author 曾远洋
 * @version 利用方法，编写计算器
 */
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据：");
		double i = sc.nextDouble();
		System.out.println("请输入第二个数据：");
		double j = sc.nextDouble();
		System.out.println("请选择计算方法：+、-、*、/");
		String k = sc.next();
		if(k.equals("+")) {
			System.out.println("结果为：" + add(i,j));
		}else if(k.equals("-")) {
			System.out.println("结果为：" + substraction(i,j));
		}else if(k.equals("*")) {
			System.out.println("结果为：" + multiplication(i,j));
		}else if(k.equals("/")) {
			System.out.println("结果为：" + division(i,j));
		}else {
			System.out.println("请正确输入计算方式！");
		}
	}
	public static double add(double a,double b) {	//加法
		return a + b;
	}
	public static double substraction(double a,double b) {	//减法
		return a - b;
	}
	public static double multiplication(double a,double b) {	 //乘法
		return a * b;
	}
	public static double division(double a,double b) { 	//除法
		return a / b;
	}
}
