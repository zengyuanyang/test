package com.mine.spring.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.mine.spring.service.IService;


public class Service implements IService,BeanNameAware,BeanFactoryAware,BeanPostProcessor,InitializingBean,DisposableBean{
	
	public Service() {
		System.out.println("1.构造方法，实例化对象");
	} 

	@Override
	public void serviceTest() {
		System.out.println("serviceTest");
	}

	@Override
	public void setBeanName(String arg0) {
		System.out.println("2.实现BeanNameAware，重写setBeanName方法");
		
	}

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		System.out.println("3.实现BeanFactoryAware，重写setBeanFactory方法");
		
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("7.实现BeanPostProcessor，重写postProcessAfterInitialization方法");
		return null;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("4.实现BeanPostProcessor，重写postProcessBeforeInitialization方法");
		return null;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("5.实现InitializingBean，重写afterPropertiseSet方法");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("8.实现DisposableBean，重写destroy方法");
	}

	@Override
	public void myInit() {
		System.out.println("6.指定初始化方法");
	}

	@Override
	public void myDestroy() {
		System.out.println("9.指定销毁方法");
	}

}
