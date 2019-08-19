import java.util.Scanner;
public class GCD_LCM{
	public static void main(String[] args){
		int gcd,lcm,r,mod;
		Scanner sca = new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int m = sca.nextInt();
		System.out.println("请输入第二个整数");
		int n = sca.nextInt();
		int product = m*n;
		int i,j;
		i = m;
		j = n;
		if(i < j){
			r = j;
			j = i;
			i = r;
		}
		
		while(j != 0){
			mod = i % j;
			i = j;
			j = mod;
		}
		gcd = i;
		lcm = product/i;
		System.out.println(m + "和" + n + "的最大公约数为：" + gcd);
		System.out.println(m + "和" + n + "的最小公倍数为：" + lcm);
	}
}