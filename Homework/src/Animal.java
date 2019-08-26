/*
动物类
成员变量：名字、重量
成员方法：觅食、交配、繁衍
*/
public class Animal {
	static int weight; //重量
	static String name; //名字
	
	public static int getWeight() {
		return weight;
	}
	public static void setWeight(int weight) {
		Animal.weight = weight;
	}
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Animal.name = name;
	}
	public Animal() {
		
	}
	public void foraging() {	//觅食方法
		System.out.println("觅食");
	}
	public void copulation() {	//交配方法
		System.out.println("交配");
	}
	public void multiply() {	//繁衍方法
		System.out.println("繁衍");
	}
}
