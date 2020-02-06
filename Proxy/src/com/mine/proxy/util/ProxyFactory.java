package com.mine.proxy.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * JDK动态代理工厂
 * @author 曾远洋
 * @time 2019年12月31日下午2:35:46
 * @version V1.0
 */
public class ProxyFactory {
	private Aspect aspect;//切面对象
	private Object target;//目标对象
	public ProxyFactory(Object target,Aspect aspect) {
		this.target = target;
		this.aspect = aspect;
	}
	public Object getProxy() {
		//Proxy类的实例化方法newProxyInstance；参数1：类加载器，classLoder；参数2：目标类的接口对象，interface；参数3：事件处理器，InvocationHandler
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				aspect.before();
				Object obj = method.invoke(target, args);
				aspect.after();
				return obj;
			}
		});
	}
}
