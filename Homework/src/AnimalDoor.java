/**
 * 动物类，猫类和狗类的父类
 * @author 曾远洋
 *
 */
public class AnimalDoor {

	private String name;
	private int age;
	private String color;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public AnimalDoor() {
		// TODO Auto-generated constructor stub
	}
	public AnimalDoor(String name,int age,String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	public void eat() {
		System.out.println("动物要吃东西");
	}

}
