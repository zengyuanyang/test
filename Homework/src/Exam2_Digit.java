import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version ��������һ��������С��10λ��������һ���ж���λ��
 */
public class Exam2_Digit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��С��ʮλ����������");
		int input = sc.nextInt();
		int i = 1;
		int weishu = 0;
		while(1 == 1) {
			if(input/i != 0) {
				weishu++;
				i *= 10;
			}else {
				break;
			}
		}
		if(weishu > 10) {
			System.out.println("λ�����࣬���������룡");
			return;
		}
		System.out.println("������һ��" + weishu + "λ���ݡ�");
	}

}
