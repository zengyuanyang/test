package com.mine.spring.test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mine.spring.dao.IUserDao;
import com.mine.spring.service.IAccountService;

public class MyTest {

	@Test
	public void test() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		IUserDao userDao = (IUserDao) applicationContext.getBean("userDao");
		try {
			userDao.insertUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		IAccountService service = (IAccountService) applicationContext.getBean("accountService");
		service.transfer("tom", "jack", 100);
	}
	
	@Test
	public void test3() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		IAccountService service = (IAccountService) applicationContext.getBean("proxyAccountService");
		service.transfer("tom", "jack", 100);
	}
	
	@Test
	public void test4() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		IAccountService service = (IAccountService) applicationContext.getBean("accountService3");
		service.transfer("tom", "jack", 100);
	}
}
