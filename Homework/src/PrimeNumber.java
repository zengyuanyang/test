import java.lang.Math;
public class PrimeNumber{
	public static void main(String[] args){
		int N = 0;
		for(int i = 101;i <= 200;i++){
			int count = 0;
			for(int j = 2;j <= Math.sqrt(i);j++){
				if(i % j == 0){
					count++;
				}
			}
			if(count == 0){
				N++;
				System.out.println(i);
				
			}
		}
		System.out.println("¸öÊýÎª" + N);
	}
}