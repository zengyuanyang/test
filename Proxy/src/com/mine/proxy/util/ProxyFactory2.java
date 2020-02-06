package com.mine.proxy.util;

import java.lang.reflect.Method;

import com.mine.proxy.service.impl.UserService2;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * CGLIB字节码增强
 * @author 曾远洋
 * @time 2020年1月9日下午2:41:53
 * @version V1.0
 */


public class ProxyFactory2 {
	public Object getProxy() {
		//声明目标类
		UserService2 userService2 = new UserService2();
		//声明切面类
		Aspect aspect = new Aspect();
		//核心类
		Enhancer enhancer = new Enhancer();
		//确定父类
		enhancer.setSuperclass(userService2.getClass());
		//设置回调函数
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
				// TODO Auto-generated method stub
				aspect.before();
				Object object = methodProxy.invokeSuper(proxy, args);
				aspect.after();
				return object;
			}
		});
		UserService2 proxyUserService = (UserService2) enhancer.create();
		
		return proxyUserService;
		
	} 
}
