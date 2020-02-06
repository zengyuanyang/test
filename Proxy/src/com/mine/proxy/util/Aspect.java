package com.mine.proxy.util;

public class Aspect {
	public void before() {
		System.out.println("开启事务");
	}
	public void after() {
		System.out.println("提交事务");
	}
}
