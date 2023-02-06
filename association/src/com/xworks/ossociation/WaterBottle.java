package com.xworks.ossociation;

public class WaterBottle {
	
	
	public String name;
	public int price;
	public String quality;
	
	
	public void init(String name,int price,String quality)
	{
		  this.name=name;
		  this.price=price;
		  this.quality=quality;
		  
	}
	
	public void display() {
		
		System.out.println("water battle name is "  + name);
		System.out.println("water battle price is "+price);
		System.out.println("water battle "    +quality);
	}

}
