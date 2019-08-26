import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 根据考试成绩输出对应的礼物，90分以上爸爸给买电脑，
 * 80分以上爸爸给买手机， 60分以上爸爸请吃一顿大餐，60分以下爸爸给买学习资料
 */
public class Exam15_Study {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：");
		int grade = sc.nextInt();
		if(grade < 0 || grade >100) {
			System.out.println("成绩输入错误！");
			return;
		}else if(grade >= 90 && grade <= 100) {
			System.out.println("买电脑！");
		}else if(grade >= 80 && grade < 90) {
			System.out.println("买手机！");
		}else if(grade >= 60 && grade < 80) {
			System.out.println("吃大餐！");
		}else {
			System.out.println("买学习资料！");
		}
	}

}
