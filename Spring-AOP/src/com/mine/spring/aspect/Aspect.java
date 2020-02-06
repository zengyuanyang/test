package com.mine.spring.aspect;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;
/**
 * 切面类
 * 前置通知：实现MethodBeforeAdvice
 * 后置通知：实现AfterReturningAdvice
 * 环绕通知：实现MethodInterceptor
 * 异常通知：实现ThrowsAdvice
 * 引介通知：实现IntroductionInterceptor
 * @author 曾远洋
 * @time 2020年1月9日下午3:15:33
 * @version V1.0
 */
@Component("aspect")
public class Aspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		System.out.println("方法前");
		Object object = methodInvocation.proceed();//手动执行目标方法
		System.out.println("方法后");
		return object;
	}

}
