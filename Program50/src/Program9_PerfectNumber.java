/**
 * 
 * @author 曾远洋
 * @version 一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程找出1000以内的所有完数
 */
public class Program9_PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i = 2;i < 1000;i++) {	//外层循环，2~1000
			int sum = 0;
			for(int j = 1;j < i;j++) {  //内层循环，用于该数的所有因数求和
				if(i % j == 0) {		//判断是否为因数
					sum = sum + j;
				}
			}
			if(sum == i) {	//如果因数和等于该数本身则输出该数
				System.out.println(i);
			}
		}
	}

}
