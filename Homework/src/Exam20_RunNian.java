/**
 * 
 * @author ��Զ��
 * @version ���1991��������е�����
 */
public class Exam20_RunNian {

	public static void main(String[] args) {
		for(int year = 1991;year <= 2019;year++) {
			if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
				System.out.println(year);
			}
		}
	}

}
