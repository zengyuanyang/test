
class Test {

	public static void main(String[] args) {
		//向下转型
			Fu f = new Zi();
			System.out.println(f.age);
			f.show();
			f.tst();
			
//			f.play;   //错误
			//向上转型
			System.out.println("===================================================");
			System.out.println(((Zi)f).age);
			System.out.println(((Zi)f).length);
			System.out.println(((Zi)f).size);
			((Zi)f).show();
			((Zi)f).tst();
			((Zi)f).play();
			
			
	}

}
class Fu{
	int age = 30;
	int length = 18;
	Fu(){
		System.out.println("父构造方法");
	}
	public void show() {
		System.out.println("父成员方法");
	}
	public static void tst() {
		System.out.println("父静态方法");
	}
}

class Zi extends Fu{
	int age = 10;
	int size = 3;
	Zi(){
		System.out.println("子构造方法");
	}
	public void show() {
		System.out.println("子成员方法");
	}
	public void play() {
		System.out.println("子玩游戏");
	}
	public static void tst() {
		System.out.println("子静态方法");
	}
}
