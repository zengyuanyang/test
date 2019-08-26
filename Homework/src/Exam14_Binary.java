import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 从键盘输入某个十进制整数数，转换成对应的二进制整数并输出
 */
public class Exam14_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个十进制整数：");
		int n = sc.nextInt();
		int count = 1;
		int k = n;
		while(1 == 1) {
			if(k/2 != 0) {
				k /= 2;
				count++;
			}else {
				break;
			}
		}
		int[] array = new int[count];
		for(int i = 0;i < array.length;i++) {
			array[i] = n%2;
			n /= 2;
		}
		System.out.print("二进制为：");
		for(int j = array.length-1;j >=0;j--) {
			System.out.print(array[j]);
		}
	}

}
