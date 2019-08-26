import java.util.Scanner;

/** 
 * 
 * @author 曾远洋
 * @version 判断一个数是否是素数
 */
public class Exam12_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int i = sc.nextInt();
		int count = 0;
		for(int j = 2;j <= Math.sqrt(i);j++){
			if(i % j == 0){
				count++;
			}
		}
		if(count == 0){
			System.out.println(i + "是素数");
				
		}else {
			System.out.println(i + "不是素数");
		}
	}

}
