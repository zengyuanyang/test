package com.mine.spring.test;


import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.mine.spring.pojo.ComponentTest;
import com.mine.spring.pojo.Job;
import com.mine.spring.pojo.User;
import com.mine.spring.service.IService;

public class SpringTest {
	
	/*
	 * 加载Spring容器的三种方式：
	 * 1.类路径获得配置文件
	 */
	@Test
	public void test1() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./bean.xml");
		IService iService = (IService) applicationContext.getBean("serviceId");
		iService.serviceTest();
	}
	
	/*
	 * 2.文件系统路径获得配置文件
	 */
	@Test
	public void test2() {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("F:\\eclipse_workspace\\Spring-IOC\\src\\bean.xml");
		IService iService = (IService) applicationContext.getBean("serviceId");
		iService.serviceTest();
	}

	/*
	 * 3.使用BeanFactory
	 */
	@Test
	public void test3() {
		BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
		IService iService = (IService) beanFactory.getBean("serviceId");
		iService.serviceTest();
	}
	
	/*
	 * 使用静态工厂实例化对象
	 */
	@Test
	public void test4() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./bean.xml");
		IService service = (IService) applicationContext.getBean("service");
		service.serviceTest();
	}
	
	/*
	 * 使用实例工厂实例化对象
	 */
	@Test
	public void test5() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./bean.xml");
		IService service = (IService) applicationContext.getBean("service2");
		service.serviceTest();
	}
	
	
	@Test
	public void test6() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user);
	}
	
	@Test
	public void test7() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		User user = (User) applicationContext.getBean("user2");
		System.out.println(user);
	}
	
	@Test
	public void test8() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Job job = (Job) applicationContext.getBean("job2");
		System.out.println(job);
	}
	
	@Test
	public void test9() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		ComponentTest component = (ComponentTest) applicationContext.getBean("component");
		System.out.println(component);
	}
}
