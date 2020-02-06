package com.mine.spring.target;

import org.springframework.stereotype.Component;

/**
 * 目标类
 * @author 曾远洋
 * @time 2020年1月9日下午3:28:48
 * @version V1.0
 */
@Component("target")
public class Target implements ITarget {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("切入点1");
	}

	@Override
	public void test2() {
		// TODO Auto-generated method stub
		System.out.println("切入点2");
	}

}
