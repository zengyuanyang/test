import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version �Ӽ�������ĳ��ʮ������������ת���ɶ�Ӧ�Ķ��������������
 */
public class Exam14_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��ʮ����������");
		int n = sc.nextInt();
		int count = 1;
		int k = n;
		while(1 == 1) {
			if(k/2 != 0) {
				k /= 2;
				count++;
			}else {
				break;
			}
		}
		int[] array = new int[count];
		for(int i = 0;i < array.length;i++) {
			array[i] = n%2;
			n /= 2;
		}
		System.out.print("������Ϊ��");
		for(int j = array.length-1;j >=0;j--) {
			System.out.print(array[j]);
		}
	}

}
