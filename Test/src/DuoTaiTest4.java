/*
 面试题：
	看程序写结果:先判断有没有问题，如果没有，写出结果
	
	多态的成员访问特点：
		方法：编译看左边，运行看右边。
		
	继承的时候：
		子类中有和父类中一样的方法，叫重写。
		子类中没有父类中出现过的方法，方法就被继承过来了。
	
	
*/
class A {
	public void show() {
		
		System.out.println("A show");
		show2();
	}
	
	public void show2() {
		System.out.println("我");
	}
	
}
class B extends A {
	
	public void show() {
		//进入
		System.out.println("B show");
		show2(); //现在show2()；到底是谁在调用 是B在调用还是C在调用
		//如果使用多态创建对象，在父类方法中再次执行一个方法，编译还是看左边，
		//只不过现在的左边是该父类的父级，然后运行，谁调用看谁
	}
	
	
	public void show2() {
		System.out.println("爱");
	}
	
}
class C extends B {
	public void show() {
		super.show(); //超类  调用父类的show()
	}
	public void show2() {
		System.out.println("你");
	}
}
//下去写执行过程

public class DuoTaiTest4 {
	public static void main(String[] args) {
		A a = new B(); //多态的体现
		a.show(); 
		/*
		首先创建A类型的B类对象，先执行A中的默认构造方法，在执行B中的默认构造方法；
		然后找A中是否有show方法，找到后编译A中的show方法，执行B中的show方法，输出B show，接着执行B中的show2方法输出 爱
		*/
		B b = new C(); //多态的体现  C子类  确定B有没有show方法，运行的时候运行C
		b.show(); 
		/*
		首先创建B类型的C类对象，先执行B中的默认构造方法，在执行C中的默认构造方法；
		然后编译B中的show，执行C中的show方法，super.show()为父类B中的show方法，输出B show，紧接着执行show2方法，由于是C类对象调用的所以
		执行C中的show2（）方法，输出你。
		*/
		//编译的时候想看B的show存不存在，运行看C的show,访问父类的show方法
		//在多态调用方法的时候，就看调用者的父类有没有该方法，有编译同没有报错。
	}
}