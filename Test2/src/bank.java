import java.util.Scanner;

/**
 * @version 练习2-3
 * @author 曾远洋
 *
 */
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入本金：");
		Scanner input = new Scanner(System.in);
		double benjin = input.nextDouble();
		System.out.println("本金为：" + benjin);
		double benxi_1y = benjin + benjin * 0.0225;
		System.out.println("存取一年后的本息是：" + benxi_1y);
		double benxi_2y = benjin + benjin * 0.027 * 2;
		System.out.println("存取两年后的本息是：" + benxi_2y);
		double benxi_3y = benjin + benjin * 0.0324 * 3;
		System.out.println("存取三年后的本息是：" + benxi_3y);
		double benxi_5y = benjin + benjin * 0.036 * 5;
		System.out.println("存取五年后的本息是：" + benxi_5y);
	}

}
