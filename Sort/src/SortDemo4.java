/**
 * 希尔排序 : 本质：将后一半（未排序）中属于前一半（已排序）的数进行位置交换
 * @author 曾远洋
 * @time 2019年9月5日下午5:31:15
 * @version V1.0
 */
public class SortDemo4 {

	public static void main(String[] args) {
		int[] arr = {26,25,18,9,6,16};
		int size = arr.length;
		int harf = size/2;	//增量
		while(harf != 0) {
			for(int i = harf;i < size;i++) {
				int j = i - harf;
				while(j >= 0 && arr[j+harf] < arr[j]) {
					int flag = arr[j+harf];
					arr[j+harf] = arr[j];
					arr[j] = flag;
					j = j-harf;		//这一步是关键
				}
			}
			harf = harf/2;
		}
		for(int i = 0;i < arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
