import java.util.Scanner;

/**
 * 从键盘输入某个十进制整数数，转换成对应的二进制整数并输出
 * @author 曾远洋
 * @version v1.0
 */
public class Exam14_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个十进制整数：");
		int n = sc.nextInt();
		int count = 1;	//记录二进制位数
		int k = n;
		//计算位数
		while(1 == 1) {
			if(k/2 != 0) {
				k /= 2;	//k = k / 2
				count++;
			}else {
				break;
			}
		}
		//创建数组
		int[] array = new int[count];
		//将余数赋给每一位元素
		for(int i = 0;i < array.length;i++) {
			array[i] = n%2;
			n /= 2;
		}
		//逆序输出就位二进制
		System.out.print("二进制为：");
		for(int j = array.length-1;j >=0;j--) {
			System.out.print(array[j]);
		}
	}

}
