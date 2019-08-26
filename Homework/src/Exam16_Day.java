import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 请根据英文单词的第一个字母判断星期几，如果第一个字母是一样的，
 *  则继续判断第二个字母。例如如果第一个字母是S,则继续判断第二个字母，如果第二个字母是a,则输出“星期六”
 */
public class Exam16_Day {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个字母（首字母大写）：");
		String str = sc.next();
		String[] array = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		for(int i = 0;i < array.length;i++) {
			String str1 = array[i].substring(0, 2);
			if(str.equals(str1)) {
				System.out.println(array[i]);
			}
		}
	}

}
