/**
 * 
 * @author ��Զ��
 * @version һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ�룻�����£������� ��10�����ʱ�������������ף���10�η�����ߣ�
 */
public class Program10_Ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double jg = 100;
		double ft = 50;
		System.out.println("��1�η����߶�Ϊ��" + ft + "m��������" + jg + "m��");
		for(int i =  2;i <= 10;i++) {
			jg = jg + ft*2;
			ft = ft/2;
			System.out.println("��" + i + "�η����߶�Ϊ��" + ft + "m��������" + jg + "m��");
		}
	}

}
