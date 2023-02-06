package com.xworks.ossociation;

public class Battery {
	
	public String name;
	public int price;
	public double voltage;
	
	
	public void init(String name, int price, double voltage) {
		
		this.name=name;
		this.price=price;
		this.voltage=voltage;
	
	}
	
	public void display() {
		
		System.out.println("battery ----name is"    +name);
		System.out.println("battery-----price is"    +price);
		System.out.println("battery-----voltage is"  +voltage);
	}

}
