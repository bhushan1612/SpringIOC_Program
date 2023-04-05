package com.example.spring.ioc.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloBeanConfig {
    @Bean
	public HelloBean helloBean() {
    	System.out.println("Calling HelloBean constructor....");
		return new HelloBean();
	}
 
    @Bean
   	public HelloJava helloJava() {
       	System.out.println("Calling helloJava constructor....");
   		return new HelloJava();
   	}
}