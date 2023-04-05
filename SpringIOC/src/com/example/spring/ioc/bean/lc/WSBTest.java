package com.example.spring.ioc.bean.lc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WSBTest {

	//use spring 6 jar
public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lcbean.xml");
		WelcomeSpringBean bean = (WelcomeSpringBean) context.getBean("springBean");
		
		System.out.println(bean.sayWelcome());
		context.registerShutdownHook();
		context.close();
		//((DefaultListableBeanFactory) context.getBeanFactory()).destroySingleton("springBean",WelcomeSpringBean.class);
		
		System.out.println("Hash code after registerShutdownHook .. "+bean.hashCode());
		System.out.println("-------------------------");
		System.out.println(bean.sayWelcome());
   }
}
