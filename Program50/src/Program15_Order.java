import java.util.Scanner;

/**
 * 
 * @author ��Զ��
 * @version ������������x,y,z���������������С�������
 */
public class Program15_Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] array = new int[3];
		for(int i = 1;i <=3;i++) {
			System.out.println("�������" + i + "������");
			array[i-1] = sc.nextInt();
		}
		if(array[0] > array[1]) {
			exchange(array,0,1);
			if(array[0] > array[2]) {
				exchange(array,0,2);
			}
			if(array[1] > array[2]) {
				exchange(array,1,2);
			}
		}else {
			if(array[0] > array[2]) {
				exchange(array,0,2);
			}
			if(array[1] > array[2]) {
				exchange(array,1,2);
			}
		}
		System.out.print("��С����������Ϊ��");
		for(int i = 0;i < array.length;i++) {
			System.out.print(array[i] + "  ");
		}
	}
	
	public static void exchange(int[] array,int a,int b) {
		int k;
		k = array[a];
		array[a] = array[b];
		array[b] = k;
	}

}
