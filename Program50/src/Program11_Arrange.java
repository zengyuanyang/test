/**
 * 
 * @author 曾远洋
 * @version 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class Program11_Arrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		int count = 0;
		//三位数用三层循环实现，每层都为1到4
		for(int i = 1;i <= 4;i++) {
			for(int j = 1;j <= 4;j++) {
				if(j == i) {	//当第二位和第一位相等时，结束本次循环
					continue;
				}
				for(int k = 1;k <= 4;k++) {
					if(k == i || k == j) {	//当第三位等于第二位或第一位时，结束本次循环
						continue;
					}
					sum = i*100 + j*10 + k;	//组合为一个三位数
					System.out.println(sum);
					count++;	//用于纪录有多少个满足要求的数据
				}
			}
		}
		System.out.println("一共" + count + "个。");
	}

}
