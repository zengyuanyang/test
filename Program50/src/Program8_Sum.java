/**
 * @author ��Զ��
 * @version ��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)������������м��̿���
 */
import java.lang.Math;
import java.util.Scanner;
public class Program8_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ӵ�������");
		int xs = sc.nextInt();
		System.out.println("������a��ֵ��");
		int a = sc.nextInt();
		for(int i = 0;i < xs;i++) {
			sum =  sum + (int)(Math.pow(10, (xs-i-1)))*a*(i+1);
		}
		System.out.println("��Ϊ��" + sum);
		sc.close();
	}

}
