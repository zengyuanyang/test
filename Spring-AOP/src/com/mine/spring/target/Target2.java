package com.mine.spring.target;

import org.springframework.stereotype.Component;

@Component("target2")
public class Target2 implements ITarget {

	@Override
	public void test() {
		System.out.println("切入点3");
	}

	@Override
	public void test2() {
		System.out.println("切入点4");
	}

}
