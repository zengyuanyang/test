import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 输入某年某月某日，判断这一天是这一年的第几天？
 */
public class Program14_Day {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");
		int year = sc.nextInt();
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		System.out.println("请输入号数：");
		int day = sc.nextInt();
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			
		}
	}

}
