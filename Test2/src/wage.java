import java.util.Scanner;

/**
 * @version ��ϰ2-1
 * @author ��Զ��
 *
 */
public class wage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);   //����Scanner����
		System.out.println("������������ʣ�");
		int jbwage = input.nextInt();
		double wujia = jbwage * 0.4;
		double fangzu = jbwage * 0.25;
		double sum = jbwage + wujia + fangzu;
		System.out.println("��Ա���Ĺ���ϸĿΪ��");
		System.out.println("��������Ϊ��" + jbwage);
		System.out.println("��۽���Ϊ��" + wujia);
		System.out.println("�������Ϊ��" + fangzu);
		System.out.println("Ա��нˮ�ǣ�" + sum);
	}

}
