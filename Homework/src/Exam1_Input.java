import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 可以从控制台连续输入数字，当输入的数字为0时不可以再输入。
 */
public class Exam1_Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1;1 == 1;i++) {
			System.out.println("请输入第" + i + "个数：");
			int input = sc.nextInt();
			if(input == 0) {
				break;
			}
		}
		System.out.println("输入结束！");
	}

}
