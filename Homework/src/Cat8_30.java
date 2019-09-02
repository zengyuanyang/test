/**
 * 猫类（具体类），继承与动物类
 * @author 曾远洋
 *
 */
public class Cat8_30 extends Animal8_30 implements Jump{
		
	public Cat8_30() {	//无参构造方法
		super();		//父类无参构造方法
	}
	public Cat8_30(String name,int age) {	//有参构造方法
		super(name,age);		//父类有参构造方法
	}
	public void eat() {	//重写eat方法
		System.out.println("猫吃鱼！");
	}
	public void jump() {		//重写接口中的方法
		System.out.println("猫跳！");
	}
}
