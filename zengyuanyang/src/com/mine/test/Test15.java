package com.mine.test;

//设计一个学生类Student和它的一个子类Undergraduate。
//（1）Student类有name和age属性，一个包包含两个参数的构造方法，用于给name和age赋值，    一个show（）方法打印Student的属性信息。
//（2）本科生类Undergraduate增加一个degree（学位）属性，有一个包含三个参数的构造方法前两个参数用于给继承的name和age属性赋值，第三个参数给degree专业赋值，一个show（） 方法用于打印Undergraduate的属性信息。
//（3）在测试类中分别创建Student对象和Undergraduate对象，调用它们的show（）。
public class Test15 {
	public static void main(String[] args) {
		//测试
		StudentTest15 s=new StudentTest15("曾远洋", 18);
		Undergraduate u =new Undergraduate("毒婷", 42, "博士后");
		s.show();
		u.show();
	}
}

