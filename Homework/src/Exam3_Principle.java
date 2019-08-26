/**
 * 
 * @author 曾远洋
 * @version 本金10000元存入银行，年利率是千分之三，每过1年，将本金和利息相加作为新的本金。计算5年后，获得的本金是多少
 */
public class Exam3_Principle {

	public static void main(String[] args) {
		double pri = 10000;
		double rate = 0.003;
		for(int i = 1;i <= 5;i++) {
			pri = pri + pri*rate;
		}
		System.out.println("五年后的本金为" + pri);
	}

}
