/**
 * 
 * @author 曾远洋
 * @version 输出等腰三角形
 *
 */
public class IsoscelesTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 5;i++) {  //外层循环，控制行数
			for(int j = 5;j > i;j--) {  //内层循环1，控制每一行的空格数
				System.out.print(" ");
			}
			for(int k = 0;k < 2*i-1;k++) {  //内层循环2，控制每一行的*个数
				System.out.print("*");
			}
			System.out.println();  //每次执行完一次外层循环后换行
		}
	}

}
