import java.util.Scanner;
/**
 * 
 * @author ��Զ��
 * @version ���÷�������д������
 */
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ�����ݣ�");
		double i = sc.nextDouble();
		System.out.println("������ڶ������ݣ�");
		double j = sc.nextDouble();
		System.out.println("��ѡ����㷽����+��-��*��/");
		String k = sc.next();
		if(k.equals("+")) {
			System.out.println("���Ϊ��" + add(i,j));
		}else if(k.equals("-")) {
			System.out.println("���Ϊ��" + substraction(i,j));
		}else if(k.equals("*")) {
			System.out.println("���Ϊ��" + multiplication(i,j));
		}else if(k.equals("/")) {
			System.out.println("���Ϊ��" + division(i,j));
		}else {
			System.out.println("����ȷ������㷽ʽ��");
		}
	}
	public static double add(double a,double b) {	//�ӷ�
		return a + b;
	}
	public static double substraction(double a,double b) {	//����
		return a - b;
	}
	public static double multiplication(double a,double b) {	 //�˷�
		return a * b;
	}
	public static double division(double a,double b) { 	//����
		return a / b;
	}
}
