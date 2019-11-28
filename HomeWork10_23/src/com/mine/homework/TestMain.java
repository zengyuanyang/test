package com.mine.homework;

import java.lang.reflect.Proxy;

public class TestMain {

	public static void main(String[] args) {
		IStudentDao isd = new StudentDaoImpl();
		MyInvocationHandler mih = new MyInvocationHandler(isd);
		IStudentDao proxy = (IStudentDao)Proxy.newProxyInstance(isd.getClass().getClassLoader(), isd.getClass().getInterfaces(), mih);
		proxy.add();
		
		
		
	}

}
