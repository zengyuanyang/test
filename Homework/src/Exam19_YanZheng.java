import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version �û���¼��֤����֤�������3�� ��������֤3�ξ��������֮��
 *  ��ӡ���������������0�λ��ᣡ���Բ�����3�ξ�������󣡡�
 */
public class Exam19_YanZheng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i <= 3;i++) {
			System.out.println("���������룺");
			int mima = sc.nextInt();
			if(i != 3) {
				System.out.println("�������������"+ (3-i) +"�λ��ᣡ");
			}else {
				System.out.println("�Բ�����3�ξ��������");
			}
		}
	}

}
