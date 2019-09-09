/**
 * 插入排序insertsort
 * @author 曾远洋
 * @time 2019年9月5日上午10:11:01
 * @version V1.0
 */
public class SortDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {24,69,80,57,13};
		for(int i = 1;i < arr.length;i++) {
			int j = i;
			while(j >= 1 && arr[j] < arr[j-1]) {
				int k = arr[j];
				arr[j] = arr[j-1];
				arr[j-1] = k;
				j--;
			}
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
