/**
 * 
 * @author ��Զ��
 * @version һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ"����"������6=1��2��3.����ҳ�1000���ڵ���������
 */
public class Program9_PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i = 2;i < 1000;i++) {	//���ѭ����2~1000
			int sum = 0;
			for(int j = 1;j < i;j++) {  //�ڲ�ѭ�������ڸ����������������
				if(i % j == 0) {		//�ж��Ƿ�Ϊ����
					sum = sum + j;
				}
			}
			if(sum == i) {	//��������͵��ڸ����������������
				System.out.println(i);
			}
		}
	}

}
