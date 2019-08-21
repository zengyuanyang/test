/**
 * 
 * @author 曾远洋
 * @version 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少
 */
public class Program13_SquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(long i = 0;i <= 100000;i++ ) {
			long a = i + 100;
			long b = i + 268;
			if((long)Math.sqrt(a)*(long)Math.sqrt(a) == a && (long)Math.sqrt(b)*(long)Math.sqrt(b) == b) {	//根据条件判断是否为完全平方数
			System.out.println(i);
			}
		}
		
		
	}

}
