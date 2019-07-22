package example;
/**
 * @version 二维数组计算总成绩
 * @author 曾远洋
 *
 */
public class totalScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arry = new int[][] {{80,66},{70,54,98},{77,59}};
		for(int i = 0;i < arry.length;i++) {
			int sum = 0;
			for(int j = 0;j < arry[i].length;j++) {
				sum += arry[i][j];
			}
			String banji = (i+1) + "班总成绩:";
			System.out.println(banji + sum);
		}
	}

}
