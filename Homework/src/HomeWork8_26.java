import com.Array.ArrayFunction;

public class HomeWork8_26 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		ArrayFunction.arrayTraversal(arr);	//遍历数组
		System.out.println(ArrayFunction.arrayMax(arr));	//输出数组中的最大值
		System.out.println(ArrayFunction.arrayMin(arr));	//输出数组中的最小值
		System.out.println(ArrayFunction.arrayIndex(arr, 5));	//索引值查找
		ArrayFunction.arrayReversedOrder(arr); //逆序输出
		//100个随机数的最大值和最小值
		int[] array = new int[100];
		for(int i = 0;i < 100;i++) {
			array[i] = (int)(Math.random()*100+1);
		}
		System.out.println(ArrayFunction.arrayMax(array));	
		System.out.println(ArrayFunction.arrayMin(array));	
		ArrayFunction.arrayReversedOrder(array);
	}

}
