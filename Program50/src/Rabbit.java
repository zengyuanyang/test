public class Rabbit{
	public static void main(String[] args){
		int pair;
		int m1 = 1;
		int m2 = 1;
		System.out.println("di1yue:1");
		System.out.println("di2yue:1");
		for(int m = 3;m < 20;m++){
			pair = m1 + m2;
			System.out.println("di" + m + "yue:" + pair);
			m1 = m2;
			m2 = pair;
		}
	}
}