
public class E {

	public static void main(String[] args) {
		byte b[] = "abc夏日的海滩".getBytes();
		System.out.println(b.length);
		String s = new String(b, 0, 7);
		System.out.println(s);
	}

}
