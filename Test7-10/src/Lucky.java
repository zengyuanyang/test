import java.util.Scanner;                       //����Scanner��

public class Lucky {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int custNo;                                //�ͻ���Ա��
		System.out.println("��������λ��Ա���ţ�");  // �����Ա����
		Scanner input = new Scanner(System.in);    //System.in�������
		custNo = input.nextInt();                  //nextInt()��ȡ�Ӽ��������һ������������ֵ��num����
		System.out.println("��Ա�����ǣ�"+custNo);
		//���á�/���͡�%����������ÿλ����
		int gewei = custNo % 10;
		int shiwei = custNo/10 % 10;
		int baiwei = custNo/100 % 10;
		int qianwei = custNo/1000;
		System.out.println("ǧλ����"+qianwei+"����λ����"+baiwei+"��ʮλ����"+shiwei+"����λ����"+gewei);
		int sum = gewei + shiwei + baiwei + qianwei;
		System.out.println("��Ա����"+custNo+"��λ֮�ͣ�"+sum);
		//�ж��Ƿ��н�
		if(sum>20) {
			System.out.println("��Ա����"+custNo+"�Ļ�Ա�����н��ˣ���Ʒ��MP3��");
		}else {
			System.out.println("��Ա����"+custNo+"�Ļ�Ա����û���н�");
		}
	}

}
