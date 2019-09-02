/**
 * 学生类
 * @author 曾远洋
 *
 */
public class Student8_30 extends Human implements Smoke {

	public Student8_30() {	//无参构造方法
		super();	//父类无参构造方法
	}
	public Student8_30(String name,int age) {	//有参构造方法
		super(name,age);		//父类有参构造方法
	}
	public void eat() {	//重写父类中的eat方法
		System.out.println("学生吃东西！");
	}
	public void smoke() {	//重写接口中的smoke方法
		System.out.println("部分同学吸烟！");
	}

}
