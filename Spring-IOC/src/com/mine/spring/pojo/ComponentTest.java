package com.mine.spring.pojo;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 * 基于注解装配
 * 需要在xml中开启组件扫描器
 * 需要引入Spring-aop包
 * 语法：component(id)
 * @Repository():dao层
 * @Service():service层
 * @Controller():web层
 */
@Component("component")
public class ComponentTest implements Serializable {
	@Autowired
	@Qualifier("user")
	private User user;

	@Override
	public String toString() {
		return "ComponentTest [user=" + user + "]";
	}
	
}
