import java.util.Scanner;
/**
 * 
 * @author ��Զ��
 * @version ������������x,y,z���������������С�������
 */
public class Program15_Order2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������� 1������");
		int a = sc.nextInt();
		System.out.println("������� 2������");
		int b = sc.nextInt();
		System.out.println("������� 3������");
		int c = sc.nextInt();
		if(a > b) {
			int k;
			k = a;
			a = b;
			b = k;
		}
		if(a > c) {
			int k;
			k = a;
			a = c;
			c = k;
		}
		if(b > c) {
			int k;
			k = b;
			b = c;
			c = k;
		}
		System.out.print(a + " " + b + " " +c);
	}

}
