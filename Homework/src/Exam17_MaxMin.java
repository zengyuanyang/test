import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version ����һ��������ʹ��ѭ��������ֵ����Сֵ������0ʱ����
 */
public class Exam17_MaxMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max;
		int min;
		System.out.println("�������1������");
		int input = sc.nextInt();
		max = input;
		min = input;
		for(int i = 2;1 == 1;i++) {
			System.out.println("�������" + i + "������");
			input = sc.nextInt();
			if(input == 0) {
				break;
			}
			if(input > max) {
				max = input;
			}
			if(input < min) {
				min = input;
			}
			
		}
		System.out.println("���ֵΪ��" + max + "����СֵΪ��" + min);
	}

}
