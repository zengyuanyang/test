/**
 * 
 * @author 曾远洋
 * @version 5文钱可以买一只公鸡，3文钱可以买一只母鸡，1文钱可以买3只雏鸡。
 * 	现在用100文钱买100只鸡，那么各有公鸡、母鸡、雏鸡多少只？
 */
public class Exam9_Checken {

	public static void main(String[] args) {
		//通过钱来判断循环上限
		int gj,mj,cj;
		for(gj = 0;gj <= 20;gj++) {
			for(mj = 0;mj <= 33;mj++) {
				for(cj = 0;cj <= 100;cj++) { //首先需要把三只雏鸡看为一个整体
					if(gj*5 + mj*3 + cj*1 == 100 && gj+mj+cj*3 == 100) {	//需要满足的两个条件：钱和只数
						System.out.println("公鸡：" + gj + "只，母鸡：" + mj + "只，雏鸡：" + cj*3 + "只。");
					}
				}
			}
		}
	}

}
