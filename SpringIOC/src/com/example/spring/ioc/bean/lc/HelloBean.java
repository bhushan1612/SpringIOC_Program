package com.example.spring.ioc.bean.lc;

public class HelloBean {

	public HelloBean() {
		System.out.println("0-arg constructor");
	}

	public static HelloBean getInstance() {
		
		return new HelloBean();
	}

	public String sayHello() {

		return "This is from sayHello()";
	}
}
