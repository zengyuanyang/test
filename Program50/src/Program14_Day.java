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
		if(year <= 0) { //判断输入的年份是否正确
			System.out.println("请正确输入年份！");
			return;
		}
		System.out.println("请输入月份：");
		int month = sc.nextInt();
		if(month <= 0 || month > 12) {	//判断输入的月份是否正确
			System.out.println("请正确输入月份！");
			return;
		}
		System.out.println("请输入号数：");
		int day = sc.nextInt();
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {	//判断输入的号数是否正确
			if(day < 1 || day > 31) {
				System.out.println("请正确输入号数！");
				return;
			}
		}else if(month == 4 || month == 6 || month == 9 || month == 11) {
			if(day < 1 || day > 30) {
				System.out.println("请正确输入号数！");
				return;
			}
			
		}
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
			if(month == 2) {
				if(day < 1 || day > 29) {
					System.out.println("请正确输入号数！");
					return;
				}
			}
		}else {
			if(month == 2) {
				if(day < 1 || day > 28) {
					System.out.println("请正确输入号数！");
					return;
				}
			}
		}
		
		
		if((year%4 == 0 && year%100 != 0) || year%400 == 0) {//判断为闰年时
			if(month >= 3) {	//闰年月份大于等于3时，天数加1
				System.out.println("这天是本年的第" + (sumday(month,day)+1) + "天。");
			}else {	//闰年的前两个月
				System.out.println("这天是本年的第" + sumday(month,day) + "天。");
			}
			
		}else {//为平年时
			System.out.println("这天是本年的第" + sumday(month,day) + "天。");
		}
		
	}
	public static int sumday(int month,int day) {	//平年天数计算的方法，返回值为int类型的天数
		int sum = 0;
		switch(month) {	//利用switch
		case 1:
			sum = day;
			break;
		case 2:
			sum = 31 + day;
			break;
		case 3:
			sum = 59 + day;
			break;
		case 4:
			sum = 90 + day;
			break;
		case 5:
			sum = 120 + day;
			break;
		case 6:
			sum = 151 + day;
			break;
		case 7:
			sum = 181 + day;
			break;
		case 8:
			sum = 212 + day;
			break;
		case 9:
			sum = 243 + day;
			break;
		case 10:
			sum = 273 + day;
			break;
		case 11:
			sum = 304 + day;
			break;
		case 12:
			sum = 334 + day;
			break;
		
		}
		return sum;
	}

}
