/**
 * 
 * @author ��Զ��
 * @version ����1000�������в��ܱ�7����������֮��
 */
public class Exam4_Sum {

	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1;i <= 1000;i++) {
			if(i % 7 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("��Ϊ��" + sum);
	}

}
