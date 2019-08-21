import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 企业发放的奖金根据利润提成。利润(I)低于或等于10万元时，奖金可提10%；
 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，高于10万元的部分，可可提成7.5%；
 * 20万到40万之间时，高于20万元的部分，可提成5%；40万到60万之间时高于40万元的部分，可提成3%；
 * 60万到100万之间时，高于60万元的部分，可提成1.5%，高于100万元时，超过100万元的部分按1%提成，
 * 从键盘输入当月利润I，求应发放奖金总数？
 */
public class Program12_Bonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入本月利润");
		long profit = sc.nextLong();
		long bonus = jiangjin(profit);
		System.out.println("本月应发奖金：" + bonus + "元。");
	}
	public static long jiangjin(long profit) {
		long bonus = 0L;
		if(profit >= 0 && profit <= 100000) {	//10万以内
			bonus = (long) (profit*0.1);
		}else if(profit > 100000 && profit <= 200000) {	//10万到20万
			bonus = (long) (100000*0.1 + (profit - 100000)*0.075);
		}else if(profit > 200000 && profit <= 400000) {	//20万到40万
			bonus = (long) (100000*0.1 + 100000*0.075 + (profit - 200000)*0.05);
		}else if(profit > 400000 && profit <= 600000) {	//40万到60万
			bonus = (long) (100000*0.1 + 100000*0.075 + 200000*0.5 + (profit - 400000)*0.03);
		}else if(profit > 600000 && profit <= 1000000) {	//60万到100万
			bonus = (long) (100000*0.1 + 100000*0.075 + 200000*0.05 + 200000*0.03 + (profit -600000)*0.015);
		}else if(profit > 1000000) {	//100万以上
			bonus = (long) (100000*0.1 + 100000*0.075 + 200000*0.05 + 200000*0.03 + 400000*0.015 + (profit - 1000000)*0.01);
		}
		return bonus;
	}
}
