/**
 * 
 * @author ��Զ��
 * @version �������������
 *
 */
public class IsoscelesTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 5;i++) {  //���ѭ������������
			for(int j = 5;j > i;j--) {  //�ڲ�ѭ��1������ÿһ�еĿո���
				System.out.print(" ");
			}
			for(int k = 0;k < 2*i-1;k++) {  //�ڲ�ѭ��2������ÿһ�е�*����
				System.out.print("*");
			}
			System.out.println();  //ÿ��ִ����һ�����ѭ������
		}
	}

}
