package com.mine.spring.target;

import org.springframework.stereotype.Component;

@Component("target3")
public class Target3 implements ITarget {

	@Override
	public void test() {
		System.out.println("切入点5");
	}

	@Override
	public void test2() {
		int i = 1/0;
		System.out.println("切入点6");
	}

}
