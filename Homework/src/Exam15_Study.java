import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version ���ݿ��Գɼ������Ӧ�����90�����ϰְָ�����ԣ�
 * 80�����ϰְָ����ֻ��� 60�����ϰְ����һ�ٴ�ͣ�60�����°ְָ���ѧϰ����
 */
public class Exam15_Study {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ɼ���");
		int grade = sc.nextInt();
		if(grade < 0 || grade >100) {
			System.out.println("�ɼ��������");
			return;
		}else if(grade >= 90 && grade <= 100) {
			System.out.println("����ԣ�");
		}else if(grade >= 80 && grade < 90) {
			System.out.println("���ֻ���");
		}else if(grade >= 60 && grade < 80) {
			System.out.println("�Դ�ͣ�");
		}else {
			System.out.println("��ѧϰ���ϣ�");
		}
	}

}
