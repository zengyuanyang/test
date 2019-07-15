import java.util.Scanner;

/**
 * @version 练习3-2
 * @author 曾远洋
 *
 */
public class day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int in;
		do {
			System.out.print("请输入数字1-7（输入0结束）");
			in = input.nextInt();
			if(in == 0) {
				break;
			}else if(in >= 1 && in <= 7){
				switch(in) {
				case 1:
					System.out.println("今天是MON");
					break;
				case 2:
					System.out.println("今天是TUE");
					break;
				case 3:
					System.out.println("今天是WED");
					break;
				case 4:
					System.out.println("今天是THU");
					break;
				case 5:
					System.out.println("今天是FRI");
					break;
				case 6:
					System.out.println("今天是SAT");
					break;
				case 7:
					System.out.println("今天是SUN");
					break;
				}
			}else {
				System.out.println("请正确输入！");
			}
		}while(true);
		System.out.println("程序结束！");
		input.close();
	}

}
