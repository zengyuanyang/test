/**
 * 
 * @author 曾远洋
 * @version 输出1991至今的所有的闰年
 */
public class Exam20_RunNian {

	public static void main(String[] args) {
		for(int year = 1991;year <= 2019;year++) {
			if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
				System.out.println(year);
			}
		}
	}

}
