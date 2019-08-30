/**
 * 8月29日作业的执行类
 * @author 曾远洋
 *
 */
public class HomeWork8_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.eat();
		new Teacher().eat();	//匿名对象调用Teacher类的成员方法
		Cat cat = new Cat();
		cat.play();
		cat.eat();
		//通过调用setXXX方法设置值
		cat.setName("Tom");
		cat.setAge(2);
		cat.setColor("白色");
		System.out.println("猫的名字是" + cat.getName() + ",猫的年龄是" + cat.getAge() + ",猫的颜色是" + cat.getColor());
		//通过有参方法设置成员变量的值
		Cat cat2 = new Cat("加菲猫",5,"橘色");
		System.out.println("猫的名字是" + cat2.getName() + ",猫的年龄是" + cat2.getAge() + ",猫的颜色是" + cat2.getColor());
		System.out.println("==============================================================");
		Dog dog = new Dog();
		dog.lookDoor();
		dog.eat();
		//通过调用setXXX方法设置值
		dog.setName("哈士奇");
		dog.setAge(3);
		dog.setColor("黑白色");
		System.out.println("狗的名字是" + dog.getName() + ",狗的年龄是" + dog.getAge() + ",狗的颜色是" + dog.getColor());
		//通过有参方法设置成员变量的值
		Dog dog2 = new Dog("阿拉斯加",3,"黑白色");
		System.out.println("狗的名字是" + dog2.getName() + ",狗的年龄是" + dog2.getAge() + ",狗的颜色是" + dog2.getColor());
		
	}

}
