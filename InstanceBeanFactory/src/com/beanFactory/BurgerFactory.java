package com.beanFactory;

public class BurgerFactory {
	
	private Burger burger  = new Burger();
	
	BurgerFactory() {
		this.burger.setName("McAloo Tikki");
		this.burger.setType("Vegeterian");
		this.burger.setOrderNo(10);
	}
	public Burger getBurger(){
		return burger;
	}
	
	

}
