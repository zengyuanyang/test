
public class Test9_3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcde";
		System.out.println(s.charAt(1));
		System.out.println(s.codePointAt(2));
		System.out.println(s.codePointBefore(2));
		System.out.println(s.codePointCount(0, 2));
		System.out.println(s.compareTo("abcdef"));
		System.out.println(s.compareToIgnoreCase("ABCDE"));
		System.out.println(s.concat("666"));
		System.out.println(s.indexOf("12"));
	}

}
