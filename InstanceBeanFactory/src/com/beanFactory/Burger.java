package com.beanFactory;

public class Burger {
	
	private String type;
	private String name;
	private int orderNo;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	
	public void show(){
		System.out.println("Type: "+type+", Name: "+name+", Order Number: "+orderNo);
	}
	
	
	

}
