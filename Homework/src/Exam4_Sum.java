/**
 * 
 * @author 曾远洋
 * @version 计算1000以内所有不能被7整除的整数之和
 */
public class Exam4_Sum {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i <= 1000;i++) {
			if(i % 7 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("和为：" + sum);
	}

}
