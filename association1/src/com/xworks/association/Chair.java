package com.xworks.association;

public class Chair {
	
	
	public String brand;
	public int price;
	public String colour;
	
	
	public void init(String brand,int price,String colour) {
		
		
		this.brand=brand;
		this. price=price;
		this.colour=colour;
		
		
	}
	
	public void display() {
		
		System.out.println("chair brand is----"+brand);
		System.out.println("chair price is-----"+price);
		System.out.println("chair colour is-----"+colour);
	}

}
