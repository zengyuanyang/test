import java.util.Scanner;

/**
 * @version ��ϰ2-3
 * @author ��Զ��
 *
 */
public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�����뱾��");
		Scanner input = new Scanner(System.in);
		double benjin = input.nextDouble();
		System.out.println("����Ϊ��" + benjin);
		double benxi_1y = benjin + benjin * 0.0225;
		System.out.println("��ȡһ���ı�Ϣ�ǣ�" + benxi_1y);
		double benxi_2y = benjin + benjin * 0.027 * 2;
		System.out.println("��ȡ�����ı�Ϣ�ǣ�" + benxi_2y);
		double benxi_3y = benjin + benjin * 0.0324 * 3;
		System.out.println("��ȡ�����ı�Ϣ�ǣ�" + benxi_3y);
		double benxi_5y = benjin + benjin * 0.036 * 5;
		System.out.println("��ȡ�����ı�Ϣ�ǣ�" + benxi_5y);
	}

}
