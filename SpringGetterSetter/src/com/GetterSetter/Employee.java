package com.GetterSetter;

public class Employee {
	
	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void show(){
		System.out.println("Details of Employee is: "+id+"  "+name);
	}
	

}
