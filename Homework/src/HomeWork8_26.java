import java.util.Scanner;

import com.Array.ArrayFunction;

public class HomeWork8_26 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		ArrayFunction.arrayTraversal(arr);	//��������
		System.out.println(ArrayFunction.arrayMax(arr));	//��������е����ֵ
		System.out.println(ArrayFunction.arrayMin(arr));	//��������е���Сֵ
		System.out.println(ArrayFunction.arrayIndex(arr, 5));	//����ֵ����
		ArrayFunction.arrayReversedOrder(arr); //�������
		//100������������ֵ����Сֵ
		int[] array = new int[100];
		for(int i = 0;i < 100;i++) {
			array[i] = (int)(Math.random()*100+1);
		}
		System.out.println(ArrayFunction.arrayMax(array));	
		System.out.println(ArrayFunction.arrayMin(array));	
		ArrayFunction.arrayReversedOrder(array);
		
		//��������Ϸ
		Scanner sc = new Scanner(System.in);
		int r = (int)(Math.random()*100+1);	//���������
		int count = 0;	//�����ۼƴ������
		while(true) {
			System.out.println("������1����100��������������" + (3-count) + "�λ���!");
			if(sc.hasNextInt()) {	//ͨ��hasNextInt���������ж������ֵ�Ƿ�������
				int i = sc.nextInt();
				if(r == i) {
					System.out.println("��ϲ������ˣ�");
				}else if(r > i) {
					System.out.println("���Ĵ�С�ˣ�");
					count++;
					if(count == 3) {	//�жϵ��������Ϊ��ʱ������Ϸ��������ȷ��
						System.out.println("���ξ������Ϸ��������ȷ��Ϊ��" + r);
						System.exit(0);
					}
				}else {
					System.out.println("���Ĵ𰸴��ˣ�");
					count++;
					if(count == 3) {
						System.out.println("���ξ������Ϸ��������ȷ��Ϊ��" + r);
						System.exit(0);
					}
				}
				
			}else {	//���벻Ϊ����ʱ������ʾ
				System.out.println("����������������룡");
				String flag = sc.next();
			}
		}
		
	}

}
