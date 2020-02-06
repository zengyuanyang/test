import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariantTest v1 = new VariantTest();
		VariantTest v2 = new VariantTest();
		VariantTest v3 = new VariantTest();
		/*
		 * HashMap:线程不安全，效率高，可以将null作为键或值
		 * HashTable:线程安全，效率低
		 * ConcurrentHashMap:线程安全，效率高
		*/
		Map<String, String> m = new ConcurrentHashMap<String, String>();
		m.put("test", "test");
		System.out.println(m);
		double x = 2;
		overloadTest(x);
	}
	
	public static void overloadTest(int i) {
		System.out.println("int");
	}
	public static void overloadTest(char c) {
		System.out.println("char");
	}
	public static void overloadTest(double  i) {
		System.out.println("double");
	}
}

class VariantTest{
	public static int staticVar = 0;  //类变量
	public int instanceVar = 0;
	public VariantTest() {
		staticVar++;
		instanceVar++;
		System.out.println("staticVar=" + staticVar + ",instanceVar=" + instanceVar);
	}
}
