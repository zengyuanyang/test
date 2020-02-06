package com.mine.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

@Component("aspect2")
public class Aspect2 {
	public void befor(JoinPoint joinPoint) {
		System.out.println("前置通知" + joinPoint.getSignature().getName());
	}
	public void after(JoinPoint joinPoint,Object ret) {
		System.out.println(ret);
		System.out.println("后置通知");
	}
	public Object round(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("前");
		Object object = joinPoint.proceed(); //手动执行
		System.out.println("后");
		return object;
		
	}
	public void thowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("抛出异常");
		System.out.println(e.getMessage());
	}
	public void myFinal() {
		System.out.println("最终");
	}
	
}
