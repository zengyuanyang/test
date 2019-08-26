import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 任意输入一个整数（小于10位），求它一共有多少位。
 */
public class Exam2_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个小于十位数的整数！");
		int input = sc.nextInt();
		int i = 1;
		int weishu = 0;
		while(1 == 1) {
			if(input/i != 0) {
				weishu++;
				i *= 10;
			}else {
				break;
			}
		}
		if(weishu > 10) {
			System.out.println("位数过多，请重新输入！");
			return;
		}
		System.out.println("该数据一共" + weishu + "位数据。");
	}

}
