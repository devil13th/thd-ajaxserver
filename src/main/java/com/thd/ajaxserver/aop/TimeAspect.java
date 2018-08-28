package com.thd.ajaxserver.aop;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {
	@Around("execution(* com.thd.ajaxserver.controller.*Controller.*(..))")
	public Object handleControllerMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("----进入AOP切片 time aspect start----");
		Object[] args = pjp.getArgs();
		for (Object arg : args) {
			System.out.println("arg is "+arg);
		}
		long start = new Date().getTime();
		Object object = pjp.proceed();
		System.out.println("time aspect 耗时:"+ (new Date().getTime() - start));
		System.out.println("----退出AOP切片 time aspect end----");
		return object;
	}

/**
 * 
注：SpringBoot 中添加切片步骤：
1.添加AOP依赖(否则项目启动的时候不会进行aop扫描)
 
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-aop</artifactId>
</dependency>

2.切面加入@Aspect @Component注释

3.写切面

 * 
 */
}


