/**
 * 
 * @author ��Զ��
 * @version һ��������������100����һ����ȫƽ�������ټ���168����һ����ȫƽ���������ʸ����Ƕ���
 */
public class Program13_SquareNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(long i = 0;i <= 100000;i++ ) {
			long a = i + 100;
			long b = i + 268;
			if((long)Math.sqrt(a)*(long)Math.sqrt(a) == a && (long)Math.sqrt(b)*(long)Math.sqrt(b) == b) {	//���������ж��Ƿ�Ϊ��ȫƽ����
			System.out.println(i);
			}
		}
		
		
	}

}
