/**
 * 
 * @author ��Զ��
 * @version ��1��2��3��4�����֣�����ɶ��ٸ�������ͬ�����ظ����ֵ���λ�������Ƕ��٣�
 */
public class Program11_Arrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum;
		int count = 0;
		//��λ��������ѭ��ʵ�֣�ÿ�㶼Ϊ1��4
		for(int i = 1;i <= 4;i++) {
			for(int j = 1;j <= 4;j++) {
				if(j == i) {	//���ڶ�λ�͵�һλ���ʱ����������ѭ��
					continue;
				}
				for(int k = 1;k <= 4;k++) {
					if(k == i || k == j) {	//������λ���ڵڶ�λ���һλʱ����������ѭ��
						continue;
					}
					sum = i*100 + j*10 + k;	//���Ϊһ����λ��
					System.out.println(sum);
					count++;	//���ڼ�¼�ж��ٸ�����Ҫ�������
				}
			}
		}
		System.out.println("һ��" + count + "����");
	}

}
