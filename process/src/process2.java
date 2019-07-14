/**
 * @version 流程控制
 * @author 曾远洋
 *
 */
public class process2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//continue 输出1-10 中非4的倍数的数字
		for(int i = 1;i <= 10;i++) {
			if(i % 4 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}
		System.out.println("循环结束。");
		for(int j = 1;j <= 100;j++) {
			if(j % 6 != 0) {
				continue;
			}
			System.out.print(j + " ");
		}
		System.out.println("循环结束。");
		//return
		for(int i = 1;i <= 10;i++) {
			if(i == 4) {
				return;
			}
			System.out.print(i + " ");
		}
		System.out.println("循环结束。");
	}
}
