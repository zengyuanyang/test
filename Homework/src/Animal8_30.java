/**
 * 动物类（动物类）
 * @author 曾远洋
 *
 */
public abstract class Animal8_30 {
	private String name;	//姓名
	private int age;		//年龄
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
	public Animal8_30() {
	}
	public Animal8_30(String name,int age) {
		this.age = age;
		this.name = name;
	}
	public abstract void eat();		//抽象方法

}
