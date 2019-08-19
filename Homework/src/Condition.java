import java.util.Scanner;
public class Condition{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		System.out.print("请输入成绩：");
		int core= sca.nextInt();
		String str = (core >= 90) ? "分，属于A" : ((core >= 60) ? "分，属于B" : "分，属于C");
		System.out.print(core + str);
	}
}