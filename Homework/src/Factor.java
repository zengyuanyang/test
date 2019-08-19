import java.util.Scanner;
public class Factor{
	public static void main(String[] args){
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int n = sca.nextInt();
		int i = 2;
		System.out.print(n + "=");
		while(1 == 1){
			
			if(n % i ==0){
				System.out.print(i + "*");
				n = n/i;
				i=2;
				continue;
			}
			i++;
			if(i == n){
				System.out.print(i);
				break;
			}
		}
	}
}