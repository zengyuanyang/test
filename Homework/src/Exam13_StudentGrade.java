import java.util.Scanner;

/** 
 * 
 * @author 曾远洋
 * @version 从键盘输入一个班5个学生的分数，求和并输出 
 */
public class Exam13_StudentGrade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] grade = new int[5];
		int sum = 0;
		for(int i = 1;i <= 5;i++) {
			System.out.println("请输入第" + i + "个学生的成绩：");
			grade[i-1] = sc.nextInt();
			sum += grade[i-1];
		}
		System.out.println("五位学生的成绩总和为：" + sum);
	}

}
