import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version ����MyMath���Square��
 */
public class HomeWork8_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	//����Scanner����
		MyMath mm = new MyMath();				//����MyMath����
		System.out.println("�������һ�����ݣ�");	//����ʵ��
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		System.out.println(a + "��" + b + "�ĺ�Ϊ��" + mm.add(a, b));	//mm����������е�add����
		System.out.println(a + "��" + b + "�Ĳ�Ϊ��" + mm.substraction(a, b));	//mm����������е�substraction����
		System.out.println(a + "��" + b + "�Ļ�Ϊ��" + mm.multiplication(a, b));	//mm����������е�multiplication����
		System.out.println(a + "��" + b + "����Ϊ��" + mm.division(a, b));	//mm����������е�division����
		
		
		Square sq = new Square();	//����Square����
		//���ڼ�������ĳ�Ա���������ó�Ա�������м���ģ�������Ҫ�Գ�Ա�������и�ֵ
		sq.setLength(a);	//�Գ�Ա����length���и�ֵ
		sq.setWeight(b);	//�Գ�Ա����weight���и�ֵ
		System.out.println("���Ϊ��" + sq.area(a, b)); //����area����
		System.out.println("�ܳ�Ϊ��" + sq.parimeter(a, b));	//����parimeter����
	}

}
