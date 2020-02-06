package com.mine.spring.target;

import org.springframework.stereotype.Component;

@Component("target4")
public class Target4 implements ITarget {

	@Override
	public void test() {
		System.out.println("切入点7");
	}

	@Override
	public void test2() {
		int i = 1/0;
		System.out.println("切入点8");
	}

}
