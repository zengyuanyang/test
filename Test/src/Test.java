
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i = 1;i <= 1000;i++) {
			if((i%3 == 2) && (i%5 == 3) && (i%7 == 2)) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("¸öÊýÎª£º" + count);
	}

}
