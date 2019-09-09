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
		/*
		reversed_order();	//����reversed_order����
        */
		/*
		sum_array();	//����sum_array����
        */	
		/*
		System.out.println("������������ǵ�������");
		int h = sc.nextInt();
		pascal_triangle(h);	//����Pascal_triangle����
        */	
		
		System.out.println("������һ��С�ڰ�λ�������ݣ�");
		int mima = sc.nextInt();
		encryption(mima);	//����encryption����
		
	}
	
	
	
	//�������������ֵ�������ַ��������Ӧ��Ԫ��
	public static void day(int i) {	
		String[] str = {"������","����һ","���ڶ�","������","������","������","������"};
		System.out.println("��ӦԪ��Ϊ��" + str[i]);
	}
	
	
	
	//Ѱ��ֵ�������еĶ�Ӧλ��
	public static void search(int i) {	
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
	
	
	
	//��������е����ֵ����Сֵ
	public static void maxmin() {	
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
	
	
	
	//�������������
	public static void reversed_order() {	
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
	
	
	
	//��ά��������Ԫ�����
	public static void sum_array() {
		int[][] sale = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		int sum = 0;
		for(int i = 0;i < sale.length;i++) {
			for(int j = 0;j < sale[i].length;j++) {
				sum = sum + sale[i][j];
			}
		}
		System.out.println("����ȵ����۶�Ϊ��" + sum);
	}
	
	
	
	//���������ǣ������ɼ��룩
	public static void pascal_triangle(int i) {
		int[][] array = new int[i][i];
		//��������ǵ�����¼���ά����
		array[0][0] = 1;
		for(int j = 1;j < array.length;j++) {
			array[j][0] = 1;
			for(int k = 1;k < array[j].length;k++) {
				array[j][k] = array[j-1][k] + array[j-1][k-1];
			}
		}
		//����������
		for(int j = 0;j < array.length;j++) {
			for(int k = 0;k < array[j].length;k++) {
				if(array[j][k] != 0) {//Ԫ�ز�Ϊ0ʱ�����Ԫ��ֵ
					System.out.print(array[j][k]);
					System.out.print('\t');
				}
			}
			System.out.print('\n');	//ÿ�������������
		}
	}
	
	
	
	//���ݼ���
	public static void encryption(int mima) {
		int weishu = 0;
		int i = 1;
		//�������ݵ�λ��
		while(1 == 1) {
			if(mima/i != 0) {
				weishu++;
				i *= 10;
			}else {
				break;
			}
		}
		if(weishu >= 8) {//�жϵ�����λ�����ڵ���8λʱ����ʾ����
			System.out.println("λ�����࣬���������룡");
			return;
		}
		System.out.println("������Ϊ��" + weishu + "λ����");
		int[] array = new int[weishu];	//��������
		int k = 1;
	    //�����������������
		for(int j = 0;j < weishu;j++) {
			array[j] = (mima/k)%10;
			k *= 10;
		}
		//�����ݽ��м��ܴ���
		for(int j = 0;j < array.length;j++) {
			array[j] = (array[j] + 5) % 10;
		}
		//��β���ݻ���
		k = array[0];
		array[0] = array[weishu-1];	
		array[weishu-1] = k;
		System.out.print("���ܺ������Ϊ��");
		for(int j = 0;j < array.length;j++) {	//����������ܺ������
			System.out.print(array[j]);
		}
	}
}
