package com.beanFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args){
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	
	CEO c = (CEO)context.getBean("CEOBean");
	
	System.out.println(c);

}
}