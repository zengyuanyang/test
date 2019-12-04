package com.mine.observer;

/**
 * 测试
 * @author 曾远洋
 * @time 2019年12月3日下午10:46:54
 * @version V1.0
 */
public class ObserverTest {
	public static void main(String[] args) {
		//创建一个目标
		ConcreteIdol idol = new ConcreteIdol();
		//创建很多粉丝
		ConcreteFan fan1 = new ConcreteFan("创创");
		ConcreteFan fan2 = new ConcreteFan("涛涛");
		ConcreteFan fan3 = new ConcreteFan("奎奎");
		//粉丝关注会唱跳和rap的明星
		idol.addFan(fan1);
		idol.addFan(fan2);
		idol.addFan(fan3);
		//明星发布动态
		idol.notifyFan("我喜欢唱、跳、rap、篮球");
	}
}
