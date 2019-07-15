import java.util.Scanner;

/**
 * @version 练习3-1
 * @author 曾远洋
 *
 */
public class max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max,min,in;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入一个整数（输入0结束）：");
		in = input.nextInt();
		max = in;
		min = in;
		do {
			System.out.println("请输入一个整数（输入0结束）：");
			in = input.nextInt();
			if(in != 0) {
				if(in >= max) {
					max = in;
				}else if(in <= min){
					min = in;
				}
			}else {
				break;
			}
		}while(true);
		System.out.println("最大值是：" + max + " 最小值是：" + min);
		input.close();
	}

}
