/**
 * 狗类，继承与动物类
 * @author 曾远洋
 *
 */
public class Dog extends AnimalDoor{

	public Dog() {
		// TODO Auto-generated constructor stub
	}
	public Dog(String name,int age,String color) {
		super(name,age,color);
	}
	public void lookDoor() {
		System.out.println("狗喜欢看门！");
	}
	public void eat() {
		super.eat();
		System.out.println("狗喜欢吃骨头！");
	}

}
