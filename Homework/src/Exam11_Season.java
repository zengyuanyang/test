import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 根据月份，输出对应的季节，并输出至少两个描述该季节的成语和活动。
 * 
 */
public class Exam11_Season {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个月份：（1——12）");
		int season = sc.nextInt();
		if(season < 1 || season > 12) {
			System.out.println("月份输入错误！");
			return;
		}else if(season >= 3 && season <= 5){
			System.out.println("春天");
			System.out.println("草长莺飞");
			System.out.println("播种！");
		}else if(season >= 6 && season <= 8){
			System.out.println("夏天");
			System.out.println("炎炎夏日");
			System.out.println("乘凉！");
		}else if(season >= 9 && season <= 11){
			System.out.println("秋天");
			System.out.println("秋高气爽");
			System.out.println("收获！");
		}else {
			System.out.println("冬天");
			System.out.println("雪上加霜");
			System.out.println("冬眠！");
		}
	}

}
