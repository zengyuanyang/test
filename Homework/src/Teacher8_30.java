/**
 * 教师类
 * @author 曾远洋
 *
 */
public class Teacher8_30 extends Human implements Smoke {

	public Teacher8_30() {	//无参构造方法
		super();		//父类无参构造方法
	}
	public Teacher8_30(String name,int age) {	//有参构造方法
		super(name,age);		//父类有参构造方法
	}
	public void eat() {	//重写父类中的eat方法
		System.out.println("老师吃东西！");
	}
	public void smoke() {	//重写接口中的smoke方法
		System.out.println("部分老师吸烟！");
	}
}
