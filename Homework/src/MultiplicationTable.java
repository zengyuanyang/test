/**
 * 
 * @author ��Զ��
 * @version ����˷��ھ���
 */
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1;i <= 9;i++) {	//���ѭ������������
			for(int j = 1;j <= i;j++) {	//�ڲ�ѭ������������
				System.out.print(j + "*" + i + "=" + i*j);
				System.out.print('\t');	 //'\t'Ϊת���ַ���������
			}
			System.out.print('\n'); //'\n'Ϊת���ַ����������
		}
	}

}
