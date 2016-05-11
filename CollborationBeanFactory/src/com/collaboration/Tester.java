package com.collaboration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Tester {

	public static void main(String[] args) {

		Resource r = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(r);

		Employee e = (Employee) factory.getBean("emp");
		System.out.println(e);

	}

}
