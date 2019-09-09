/**
 * 选择排序selectsort
 * @author 曾远洋
 * @time 2019年9月5日上午10:08:27
 * @version V1.0
 */
public class SortDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {24,69,80,57,13};
		for(int i = 0;i < arr.length-1;i++) {
			for(int j = i+1;j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					int k = arr[i];
					arr[i] = arr[j];
					arr[j] = k;
				}
			}
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
