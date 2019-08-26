import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 根据成绩输出对应的等级，使用if多分支和switch语句分别实现
 */
public class Exam10_Level {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入成绩：（0——100）");
		int grade = sc.nextInt();
		if(grade < 0 || grade >100) {
			System.out.println("成绩输入错误！");
			return;
		}else if(grade >= 90 && grade <= 100) {
			System.out.println("优秀");
		}else if(grade >= 80 && grade < 90) {
			System.out.println("良好");
		}else if(grade >= 70 && grade < 80) {
			System.out.println("一般");
		}else if(grade >= 60 && grade < 70) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
		
		switch(grade) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
		case 92:
		case 91:
		case 90:
			System.out.println("优秀");
			break;
		case 89:
		case 88:
		case 87:
		case 86:
		case 85:
		case 84:
		case 83:
		case 82:
		case 81:
		case 80:	
			System.out.println("良好");
			break;
		case 79:
		case 78:
		case 77:
		case 76:
		case 75:
		case 74:
		case 73:
		case 72:
		case 71:
		case 70:
			System.out.println("一般");
			break;
		case 69:
		case 68:
		case 67:
		case 66:
		case 65:
		case 64:
		case 63:
		case 62:
		case 61:
		case 60:
			System.out.println("及格");
			break;
		default:
			System.out.println("不及格");
			break;
		}
	}

}
