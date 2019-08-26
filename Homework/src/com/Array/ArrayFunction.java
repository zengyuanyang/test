package com.Array;


/**
 * �����������ط���
 * @author ��Զ��
 * @version v1.0
 * 
 */
public class ArrayFunction {

	private ArrayFunction() {	//���췽��ǰ��private�������װ�ڸ����У�ֻ��ͨ������.��������
		
	}
	
	/**
	 * �������飬�����鰴[Ԫ��1��Ԫ��2��Ԫ��3��...]��ʽ���
	 * @param arr ��Ҫ�������������
	 * 
	 */
	public static void arrayTraversal(int[] arr) {
		System.out.print("[");
		for(int i = 0;i < arr.length;i++) {
			if(i == arr.length-1) {
				System.out.print(arr[i] + "]" + '\n');
			}else {
				System.out.print(arr[i] + ",");
			}
		}
	}
	
	/**
	 * ������������ֵ
	 * @param arr	�������ֵ������
	 * @return	max  ����������ֵ
	 */
	public static int arrayMax(int[] arr) {
		int max = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	/**
	 * �����������Сֵ
	 * @param arr ������Сֵ������
	 * @return min  ���������Сֵ
	 */
	public static int arrayMin(int[] arr) {
		int min = arr[0];
		for(int i = 0;i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	/**
	 * ����һ����������������ֵ
	 * @param arr	�������ڵ�����
	 * @param a �����ҵ���
	 * @return �����������е�����ֵ
	 */
	public static int arrayIndex(int[] arr,int a) {
		int i;
		for(i = 0;i < arr.length;i++) {
			if(arr[i] == a) {
				break;
			}
		}
		return i;
	}
	
	/**
	 * ��һ�������������
	 * @param arr	��Ҫ���������
	 */
	public static void arrayReversedOrder(int[] arr) {
		for(int i = 0;i < arr.length/2;i++) {
			int k;
			k = arr[i];
			arr[i] = arr[arr.length-1-i];
			 arr[arr.length-1-i] = k;
		}
		arrayTraversal(arr);	//���ñ�������
	}
}
