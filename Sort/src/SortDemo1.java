/**
 * 冒泡排序bubblesort
 * @author 曾远洋
 * @time 2019年9月5日上午9:55:50
 * @version V1.0
 */
public class SortDemo1 {

	public static void main(String[] args) {
		int[] arr = {24,69,80,57,13};
		for(int j = 0; j < arr.length-1;j++) {
			for(int i = 0;i < arr.length-1-j;i++) {
				if(arr[i] > arr[i+1]) {
					int k = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = k;
				}
			}
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
