package com.abhi.springAop;

import org.springframework.stereotype.Component;

@Component
public class Operation {
	public void task1() {
		System.out.println("Task1 commenced....");
	}
	public void task1(String name) {
		System.out.println("Task1 commenced by "+name);
	}
	public void task2() {
		System.out.println("Task2 commenced....");
	}
}
