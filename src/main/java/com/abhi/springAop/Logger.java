package com.abhi.springAop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Logger {
	
	//@Before("execution(public void task1())")
	//@Before("execution(public void task*())")
	//@Before("execution(public void task*(*))")
	@Before("execution(public void task*(..))")
	//@Before("execution(public void com.abhi.springAop.Operation.*.task*(..))")
	void beforeAnyTask(){
		System.out.println("\n@Before Registering task....");
		
	}
	
	//@After("execution(public void task1())")
	@After("execution(public void task*(..))")
	void afterAnyTask() {
		System.out.println("@After Task Completion Logged!\n");
	}

}
