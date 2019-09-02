/**
 * 猫类，继承与动物类
 * @author 曾远洋
 *
 */
public class Cat extends AnimalDoor{

	public Cat() {	//无参构造方法
		super();
		// TODO Auto-generated constructor stub
	}
	public Cat(String name,int age,String color) {	//有参构造方法
		super(name,age,color);	//调用父类的有参构造方法
	}
	public void play() {	
		System.out.println("猫喜欢玩！");
	}
	public void eat() {
		super.eat();
		System.out.println("猫喜欢吃鱼！");
	}

}
