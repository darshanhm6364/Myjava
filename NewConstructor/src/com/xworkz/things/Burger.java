package com.xworkz.things;

public class Burger {

	public String type;
	public int price;
	public String name;
	public String company;
	public String patty;
	public String toppings;
	public String bun;
	public String sauces;
	
	public Burger(String type, int price,String name,String company, String patty,String toppings,String bun, String sauces) {
		
		this.type=type;
		this.price=price;
		this.name=name;
		this.company=company;
		this .patty=patty;
		this.toppings=toppings;
		this.bun=bun;
		this.sauces=sauces;
		
	}
	
	public void disply() {
		
		System.out.println("Burger type is :"+this.type +"burger price is :"+ this.price +"burger name is :"+this.name  +"burger company is  :"+this.company +"burger patty is  :"+this.patty  +"burger is toppings  :"+this.toppings     +"burger is bun   :"+this.bun  +"burger is cheese  :"+this.sauces);
 	}
}
