import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version 8��21����ҵ
 */
public class HomeWork8_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("������һ������ֵ��");
		int i = sc.nextInt();
		day(i);	//���÷���day
		*/		
		/*
		System.out.println("������һ������");
		int j = sc.nextInt();
		search(j);	//����search����
        */		
		/*
		maxmin();	//����maxmin����
        */	
		reversed_order();	//����reversed_order����
		}
	public static void day(int i) {	//�������������ֵ�������ַ��������Ӧ��Ԫ��
		String[] str = {"������","����һ","���ڶ�","������","������","������","������"};
		System.out.println("��ӦԪ��Ϊ��" + str[i]);
	}
	public static void search(int i) {	//Ѱ��ֵ�������еĶ�Ӧλ��
		int[] array = {1,3,6,12,8,6,9};
		int count = 0;
		for(int j = 0;j < array.length;j++) {
			if(array[j] == i) {	//�ж�Ԫ��������ֵ�Ƿ����
				System.out.println("�����������е�λ���ǣ�" + (j+1));
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("������û�и����ݣ�");
		}
	}
	public static void maxmin() {	//��������е����ֵ����Сֵ
		int[] array = {2,8,13,6,22,64,1,24};
		int max = array[0];
		int min = array[0];
		for(int i = 0;i < array.length;i++) {
			if(array[i] >= max) {	//��Ԫ����max���бȽϣ�������ڵ���max���ͽ���Ԫ�ص�ֵ����max
				max = array[i];
			}
			if(array[i] <= min) {	//��Ԫ����min���бȽϣ����С�ڵ���min���ͽ���Ԫ�ص�ֵ����min
				min = array[i];
			}
		}
		System.out.println("���������ֵΪ��" + max + "����СֵΪ��" + min);
	}
	public static void reversed_order() {	//�������������
		int[] array = {1,3,8,9,14,16,5};
		System.out.print("�����������Ϊ��[");
		
		for(int i = 0;i < array.length;i++) {	//���������������
			if(i == array.length-1) {
				System.out.print(array[i] + "]");
			}else {
				System.out.print(array[i] + ",");
			}
		}
		for(int i = 0;i < array.length/2;i++) {	//����������
			int j;
			j = array[i];
			array[i] = array[array.length-1-i];
			array[array.length-1-i] = j;
		}
		System.out.print('\n');
		System.out.print("�����������Ϊ��[");
		for(int i = 0;i < array.length;i++) {	//����������������
			if(i == array.length-1) {
				System.out.print(array[i] + "]");
			}else {
				System.out.print(array[i] + ",");
			}
		}
		
	}
}
