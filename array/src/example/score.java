package example;
import java.util.Scanner;

/**
 * @version ʹ���������ɼ�
 * @author ��Զ��
 *
 */
public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grade = new int[5];
		float sum = 0;
		float avg;
		int max,min;
		Scanner input = new Scanner(System.in);
		System.out.println("���������ѧ���ı��Գɼ���");
		for(int i = 0;i < grade.length;i++) {
			grade[i] = input.nextInt();
		}
		max = grade[0];
		min = grade[0];
		for(int i = 0;i < grade.length;i++) {
			sum += grade[i];
			if(grade[i] >= max) {
				max = grade[i];
			}
			if(grade[i] <= min) {
				min = grade[i];
			}
		}
		avg = sum/5;
		System.out.println("�ܳɼ���" + sum);
		System.out.println("��߷֣�" + max);
		System.out.println("��ͷ֣�" + min);
		System.out.println("ƽ���֣�" + avg);
		input.close();
	}

}
