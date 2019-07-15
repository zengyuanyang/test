import java.util.Scanner;

/**
 * @version 练习3-3
 * @author 曾远洋
 *
 */
public class airplane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month,canghao;
		int cost = 5000;
		double price;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入您出行的月份：1~12");
		month = input.nextInt();
		System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
		canghao = input.nextInt();
		if(month >= 4 && month <= 10) {
			if(canghao == 1) {
				price = cost * 0.9;
			}else {
				price = cost * 0.6;
			}
		}else {
			if(canghao == 1) {
				price = cost * 0.5;
			}else {
				price = cost * 0.4;
			}
		}
		System.out.println("您的机票价格为：" + price);
		input.close();
	}

}
