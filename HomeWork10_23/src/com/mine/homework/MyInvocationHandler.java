package com.mine.homework;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
	private IStudentDao isd;
	public MyInvocationHandler(IStudentDao isd) {
		this.isd = isd;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("开启数据库");
		method.invoke(isd, args);
		System.out.println("关闭数据库");
		return null;
	}

}
