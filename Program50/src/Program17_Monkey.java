/**
 * 
 * @author ��Զ��
 * @version ���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬
 * �ֶ����һ�� �ڶ��������ֽ�ʣ�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�µ�һ����һ����
 * ����10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١�
 */
public class Program17_Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		for(int i = 1;i < 10;i++) {
			count = (count + 1)*2;
		}
		System.out.print("һ��������" + count + "����");
	}

}
