/**
 * @version ��ϰ2-2
 * @author ��Զ��
 *
 */
public class exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int left,right,center;
		left = 10;
		right = 8;
		System.out.println("�������ǰ���е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ�" + left);
		System.out.println("�����е�ֽ�ƣ�" + right);
		System.out.println();
		 //���������е�ֵ
		center = left;
		left = right;
		right = center;
		System.out.println("������������е�ֽ�ƣ�");
		System.out.println("�����е�ֽ�ƣ�" + left);
		System.out.println("�����е�ֽ�ƣ�" + right);
	}

}
