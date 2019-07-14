import java.util.Scanner;

/**
 * @version 流程控制
 * @author 曾远洋
 *
 */
public class process {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if选择结构
		System.out.println("请输入成绩：");
		Scanner input = new Scanner(System.in);
		/*int grade = input.nextInt();
		if(grade >= 60) {
			System.out.println("成绩合格。通过考试。");
		}else {
			System.out.println("成绩不合格。考试未通过。");
		}
		//多分支if语句
		if(grade >= 90 && grade <=100) {
			System.out.println("A级");
		}else if(grade >= 80) {
			System.out.println("B级");
		}else if(grade >= 70) {
			System.out.println("C级");
		}else if(grade >= 60) {
			System.out.println("D级");
		}else {
			System.out.println("E级");
		}
		//switch语句
		switch(grade/10) {
		case 10:
		case 9:
			System.out.println("A级");
			break;
		case 8:
			System.out.println("B级");
			break;
		case 7:
			System.out.println("C级");
			break;
		case 6:
			System.out.println("D级");
			break;
		default:
			System.out.println("E级");
		}
		//嵌套if控制语句
		System.out.println("请输入今天星期几：");
		int day = input.nextInt();
		System.out.println("请输入今天的气温：");
		double temp = input.nextDouble();
		String weather = "天气好";
		if(day == 6 || day == 7) {
			if(temp > 30) {
				System.out.println("去游泳");
			}else {
				System.out.println("去爬山");
			}
		}else {
			if(weather.equals("天气好")) {
				System.out.println("去客户单位谈业务");
			}else {
				System.out.println("在公司上网查资料");
			}
		}*/
		//while循环
		int i=1;
		int sum=0;
		while(i <= 100) {
			sum = sum + i; //sum += i
			i++;
		}
		System.out.println("和为：" + sum);
		//do-while
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		}while(i <= 100);
		System.out.println("和为：" + sum);
		//for循环   多重循环
		/*String end = null;
		do {                  //由于程序开始运行就直接执行了一次，所以选择do-while
		String name;
		int score;
		int zongfen = 0;
		double avg;
		System.out.print("输入学生姓名：");
		name = input.next();
		for(int j = 1;j <= 5;j++) {
			System.out.print("请输入5门功课中第" + j + "门课的成绩：");
			score = input.nextInt();
			zongfen += score;
		}
		avg = zongfen/5;
		System.out.println(name + "的平均分是：" + avg);
		System.out.println("继续输入吗（y/n）？");
		end = input.next();
		}while(end.equals("y") || end.equals("Y"));
		System.out.println("成绩录入结束");*/
		//跳转语句1
		for(int k = 1;k <= 10;k++) {
			if(k % 4 == 0) {
				break;
			}
			System.out.print(k + " ");
		}
		System.out.println("循环结束。");
		//跳转语句2
		String str = "";
		while(true) {
			System.out.println("请输入字符串：");
			str = input.next();
			System.out.println("您输入的字符串是：" + str);
			if(str.equals("bye")) {
				break;
			}
		}
		System.out.println("输入结束。");
	}

}
