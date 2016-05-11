package com.helloSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
		
		Bean1 b1 = (Bean1) ac.getBean("bean1");
		Bean2 b2 = (Bean2) ac.getBean("bean2");
		
		b1.message();
		b2.secondMessage();

	}

}
