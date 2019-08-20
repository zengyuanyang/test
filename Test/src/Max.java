import java.util.Scanner;

/** 
 * 
 * @author 曾远洋
 * @version 使用方法，实现输入三个数，返回最大值
 */
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int i = sc.nextInt();
		System.out.println("请输入第二个数：");
		int j = sc.nextInt();
		System.out.println("请输入第三个数：");
		int k = sc.nextInt();
		int m = max(max(i,j),k); 	//嵌套使用max方法比较三个数的大小
		System.out.println("三个数中的最大值为：" + m);
	}
	public static int max(int a,int b) {		 //此方法用于比较两个数的最大值
		return a > b ? a : b;                //利用三目运算符进行判断
	}
}
