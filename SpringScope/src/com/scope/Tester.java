package com.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext context  = new ClassPathXmlApplicationContext("spring.xml");
		
		PrototypeScope ps = (PrototypeScope)context.getBean("bean1");
		PrototypeScope ps1 = (PrototypeScope)context.getBean("bean1");
		SingletonScope ss = (SingletonScope)context.getBean("bean2");
		SingletonScope ss1 = (SingletonScope)context.getBean("bean2");
		
		
		System.out.println(ps==ps1);
		System.out.println(ss==ss1);
		
		ps.beanShow();
		ss.beanShow();
		
	}

}
