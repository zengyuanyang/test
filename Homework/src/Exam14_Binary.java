import java.util.Scanner;

/**
 * �Ӽ�������ĳ��ʮ������������ת���ɶ�Ӧ�Ķ��������������
 * @author ��Զ��
 * @version v1.0
 */
public class Exam14_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��ʮ����������");
		int n = sc.nextInt();
		int count = 1;	//��¼������λ��
		int k = n;
		//����λ��
		while(1 == 1) {
			if(k/2 != 0) {
				k /= 2;	//k = k / 2
				count++;
			}else {
				break;
			}
		}
		//��������
		int[] array = new int[count];
		//����������ÿһλԪ��
		for(int i = 0;i < array.length;i++) {
			array[i] = n%2;
			n /= 2;
		}
		//���������λ������
		System.out.print("������Ϊ��");
		for(int j = array.length-1;j >=0;j--) {
			System.out.print(array[j]);
		}
	}

}
