package com.mine.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("aspect3")
@Aspect
public class Aspect3 {
	@Pointcut("execution(* com.mine.spring.target.Target4.*(..))")
	public void pointCut() {
		
	}
	@Before(value="pointCut()")
	public void befor(JoinPoint joinPoint) {
		System.out.println("前置通知" + joinPoint.getSignature().getName());
	}
	@AfterReturning(value="pointCut()",returning="ret")
	public void after(JoinPoint joinPoint,Object ret) {
		System.out.println(ret);
		System.out.println("后置通知");
	}
	@Around(value="pointCut()")
	public Object round(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("前");
		Object object = joinPoint.proceed(); //手动执行
		System.out.println("后");
		return object;
		
	}
	@AfterThrowing(value="pointCut()",throwing="e")
	public void thowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("抛出异常");
		System.out.println(e.getMessage());
	}
	@After(value="pointCut()")
	public void myFinal() {
		System.out.println("最终");
	}
	
}
