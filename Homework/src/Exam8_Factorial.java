import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version �ӿ���̨����һ������������������Ľ׳ˡ���������5���׳�Ϊ 5*4*3*2*1
 */
public class Exam8_Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		int i = sc.nextInt();
		System.out.print(i + "�Ľ׳�Ϊ");
		for(int j = i;j > 0;j--) {
			if(j != 1) {
				System.out.print(j + "*");
			}else {
				System.out.print(j);
			}
		}
	}

}
