import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 用户登录验证，验证次数最多3次 并且在验证3次均输入错误之后，
 *  打印“输入错误，您还有0次机会！“对不起，您3次均输入错误！”
 */
public class Exam19_YanZheng {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i <= 3;i++) {
			System.out.println("请输入密码：");
			int mima = sc.nextInt();
			if(i != 3) {
				System.out.println("输入错误，您还有"+ (3-i) +"次机会！");
			}else {
				System.out.println("对不起，您3次均输入错误！");
			}
		}
	}

}
