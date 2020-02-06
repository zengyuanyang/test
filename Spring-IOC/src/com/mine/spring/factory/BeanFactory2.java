package com.mine.spring.factory;

import com.mine.spring.service.IService;
import com.mine.spring.service.impl.Service;
/**
 * 实例工厂
 * @author 曾远洋
 * @time 2020年1月8日下午6:56:39
 * @version V1.0
 */
public class BeanFactory2 {
	public IService createServiceFactory() {
		return new Service();
	}
}
