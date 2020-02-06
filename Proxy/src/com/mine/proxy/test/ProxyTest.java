package com.mine.proxy.test;


import org.junit.Test;

import com.mine.proxy.service.IUserService;
import com.mine.proxy.service.impl.UserService;
import com.mine.proxy.service.impl.UserService2;
import com.mine.proxy.util.Aspect;
import com.mine.proxy.util.ProxyFactory;
import com.mine.proxy.util.ProxyFactory2;

public class ProxyTest {

	/*
	 * 测试JDK动态代理
	 */
	@Test
	public void test() {
		IUserService target = new UserService();
		Aspect aspect = new Aspect();
		ProxyFactory proxyFactory = new ProxyFactory(target, aspect);
		IUserService proxy = (IUserService) proxyFactory.getProxy();
		proxy.addUser();
		proxy.updateUser();
		proxy.deleteUser();
	}
	
	/*
	 * 测试cglib字节码增强
	 */
	@Test
	public void test2() {
		ProxyFactory2 factory2 = new ProxyFactory2();
		UserService2 service2 = (UserService2) factory2.getProxy();
		service2.addUser();
		service2.updateUser();
		service2.deleteUser();
	}

}
