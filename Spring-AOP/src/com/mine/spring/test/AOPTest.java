package com.mine.spring.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mine.spring.target.ITarget;

public class AOPTest {

	/*
	 * 使用AOP联盟编写半自动代理
	 * 需要aopalliance包
	 * getBean(工厂)
	 */
	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		ITarget target = (ITarget) applicationContext.getBean("proxyFactory");
		target.test();
		target.test2();
	}
	
	
	/*
	 * 全自动AOP编程
	 * 需要aspectj.weaver包
	 * getBean(目标对象)
	 */
	@Test
	public void test2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		ITarget target = (ITarget) applicationContext.getBean("target2");
		target.test();
		target.test2();
	}
	
	
	/*
	 * AspectJ编程
	 */
	@Test
	public void test3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		ITarget target = (ITarget) applicationContext.getBean("target3");
		target.test();
		target.test2();
	}
	
	/*
	 * AOP注解测试
	 */
	@Test
	public void test4() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		ITarget target = (ITarget) applicationContext.getBean("target4");
		target.test();
		target.test2();
	}
}
