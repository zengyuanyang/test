import java.util.Scanner;

/** 
 * 
 * @author ��Զ��
 * @version �Ӽ�������һ����5��ѧ���ķ�������Ͳ���� 
 */
public class Exam13_StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] grade = new int[5];
		int sum = 0;
		for(int i = 1;i <= 5;i++) {
			System.out.println("�������" + i + "��ѧ���ĳɼ���");
			grade[i-1] = sc.nextInt();
			sum += grade[i-1];
		}
		System.out.println("��λѧ���ĳɼ��ܺ�Ϊ��" + sum);
	}

}
