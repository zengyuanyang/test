import java.util.Scanner;

/**
 * 
 * @author 曾远洋
 * @version 测试MyMath类和Square类
 */
public class HomeWork8_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	//创建Scanner对象
		MyMath mm = new MyMath();				//创建MyMath对象
		System.out.println("请输入第一个数据：");	//输入实参
		int a = sc.nextInt();
		System.out.println("请输入第二个数据");
		int b = sc.nextInt();
		System.out.println(a + "和" + b + "的和为：" + mm.add(a, b));	//mm对象调用类中的add方法
		System.out.println(a + "和" + b + "的差为：" + mm.substraction(a, b));	//mm对象调用类中的substraction方法
		System.out.println(a + "和" + b + "的积为：" + mm.multiplication(a, b));	//mm对象调用类中的multiplication方法
		System.out.println(a + "和" + b + "的商为：" + mm.division(a, b));	//mm对象调用类中的division方法
		
		
		Square sq = new Square();	//创建Square对象
		//由于计算面积的成员方法是利用成员变量进行计算的，所以需要对成员变量进行赋值
		sq.setLength(a);	//对成员变量length进行赋值
		sq.setWeight(b);	//对成员变量weight进行赋值
		System.out.println("面积为：" + sq.area(a, b)); //调用area方法
		System.out.println("周长为：" + sq.parimeter(a, b));	//调用parimeter方法
	}

}
