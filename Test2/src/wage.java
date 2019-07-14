import java.util.Scanner;

/**
 * @version 练习2-1
 * @author 曾远洋
 *
 */
public class wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);   //创建Scanner对象
		System.out.println("请输入基本工资：");
		int jbwage = input.nextInt();
		double wujia = jbwage * 0.4;
		double fangzu = jbwage * 0.25;
		double sum = jbwage + wujia + fangzu;
		System.out.println("该员工的工资细目为：");
		System.out.println("基本工资为：" + jbwage);
		System.out.println("物价津贴为：" + wujia);
		System.out.println("房租津贴为：" + fangzu);
		System.out.println("员工薪水是：" + sum);
	}

}
