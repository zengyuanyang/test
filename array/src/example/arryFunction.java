package example;

import java.util.Arrays;

/**
 * @version arrays�ೣ�÷���
 * @author ��Զ��
 *
 */
public class arryFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�Ƚ����������Ƿ����
		int[] arr1 = new int[] {10,50,40,30};
		int[] arr2 = new int[] {10,50,40,30};
		int[] arr3 = new int[] {60,50,85};
		System.out.println(Arrays.equals(arr1, arr2)); //�ж�arr1��arr2�ĳ��ȼ�Ԫ���Ƿ����
		System.out.println(Arrays.equals(arr1, arr3)); //�ж�arr1��arr3�ĳ��ȼ�Ԫ���Ƿ����
		//�������Ԫ�ؽ�����������
		int[][] array = new int[][] {{80,66},{70,54,98},{77,59}};
		for(int i = 0;i < array.length;i++) {
			Arrays.sort(array[i]);
			String banji = (i+1) + "�������ĳɼ���";
			System.out.println(banji);
			for(int j = 0;j < array[i].length;j++) {
				System.out.println(array[i][j]);
			}
		}
		//����ת��Ϊ�ַ���
		int[] str = new int[] {20,30,40,50};
		String Str = Arrays.toString(str);
		System.out.println(Str);
		//����������Ԫ�ظ�ֵΪ��ͬ��ֵ
		int[] arr = new int[] {10,20,30,40};
		Arrays.fill(arr, 50);
		System.out.println(Arrays.toString(arr));
		//�����鸴�Ƴ�һ������Ϊ�趨ֵ��������
		int[] arr4 = new int[] {10,20,30,40};
		int[] arr5 = Arrays.copyOf(arr4, 3);
		System.out.println(Arrays.toString(arr5));
		int[] arr6 = Arrays.copyOf(arr4, 4);
		System.out.println(Arrays.toString(arr6));
		int[] arr7 = Arrays.copyOf(arr4, 6);
		System.out.println(Arrays.toString(arr7));
		//��ѯԪ���������е��±�
		int index = Arrays.binarySearch(arr4, 10);
		System.out.println(index);
		index = Arrays.binarySearch(arr4, 40);
		System.out.println(index);
	}

}
