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
	}

}
