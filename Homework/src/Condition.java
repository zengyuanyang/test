import java.util.Scanner;
public class Condition{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		System.out.print("������ɼ���");
		int core= sca.nextInt();
		String str = (core >= 90) ? "�֣�����A" : ((core >= 60) ? "�֣�����B" : "�֣�����C");
		System.out.print(core + str);
	}
}