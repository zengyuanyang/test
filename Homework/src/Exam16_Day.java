import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version �����Ӣ�ĵ��ʵĵ�һ����ĸ�ж����ڼ��������һ����ĸ��һ���ģ�
 *  ������жϵڶ�����ĸ�����������һ����ĸ��S,������жϵڶ�����ĸ������ڶ�����ĸ��a,���������������
 */
public class Exam16_Day {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������������ĸ������ĸ��д����");
		String str = sc.next();
		String[] array = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for(int i = 0;i < array.length;i++) {
			String str1 = array[i].substring(0, 2);
			if(str.equals(str1)) {
				System.out.println(array[i]);
			}
		}
	}

}
