/**
 * @version ���̿���
 * @author ��Զ��
 *
 */
public class process2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue ���1-10 �з�4�ı���������
		for(int i = 1;i <= 10;i++) {
			if(i % 4 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println("ѭ��������");
		for(int j = 1;j <= 100;j++) {
			if(j % 6 != 0) {
				continue;
			}
			System.out.print(j + " ");
		}
		System.out.println("ѭ��������");
		//return
		for(int i = 1;i <= 10;i++) {
			if(i == 4) {
				return;
			}
			System.out.print(i + " ");
		}
		System.out.println("ѭ��������");
	}
}
