import java.util.Scanner;

/** 
 * 
 * @author ��Զ��
 * @version ʹ�÷�����ʵ���������������������ֵ
 */
public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int i = sc.nextInt();
		System.out.println("������ڶ�������");
		int j = sc.nextInt();
		System.out.println("���������������");
		int k = sc.nextInt();
		int m = max(max(i,j),k); 	//Ƕ��ʹ��max�����Ƚ��������Ĵ�С
		System.out.println("�������е����ֵΪ��" + m);
	}
	public static int max(int a,int b) {		 //�˷������ڱȽ������������ֵ
		return a > b ? a : b;                //������Ŀ����������ж�
	}
}
