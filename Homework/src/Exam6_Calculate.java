/**
 * 
 * @author ��Զ��
 * @version ���� 1+2-3+4-5+6-7....+100�Ľ��
 */
public class Exam6_Calculate {

	public static void main(String[] args) {
		int sum = 1;
		for(int i = 2;i <= 100;i++) {
			if(i % 2 == 0) {
				sum = sum + i;
			}else {
				int j;
				j = 0 - i;
				sum = sum + j;
			}
		}
		System.out.println("1+2-3+4-5+6-7....+100�Ľ��Ϊ��" + sum);
	}

}
