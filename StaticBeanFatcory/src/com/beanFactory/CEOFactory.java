package com.beanFactory;

public class CEOFactory {
	
	private static final CEO c = new CEO();
	
	private CEOFactory(){
		
		System.out.println("In Factory");
	}
	
	public CEO getInstance(){
		return c;
	}
	
	

}