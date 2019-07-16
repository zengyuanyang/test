package example;
import java.util.Scanner;

/**
 * @version 使用数组计算成绩
 * @author 曾远洋
 *
 */
public class score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] grade = new int[5];
		float sum = 0;
		float avg;
		int max,min;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入五个学生的笔试成绩：");
		for(int i = 0;i < grade.length;i++) {
			grade[i] = input.nextInt();
		}
		max = grade[0];
		min = grade[0];
		for(int i = 0;i < grade.length;i++) {
			sum += grade[i];
			if(grade[i] >= max) {
				max = grade[i];
			}
			if(grade[i] <= min) {
				min = grade[i];
			}
		}
		avg = sum/5;
		System.out.println("总成绩：" + sum);
		System.out.println("最高分：" + max);
		System.out.println("最低分：" + min);
		System.out.println("平均分：" + avg);
		input.close();
	}

}
