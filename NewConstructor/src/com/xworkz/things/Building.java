package com.xworkz.things;

public class Building {
	
	
	public String name;
	public int    flateNum;
	public float price;
	public String area;
	public String state;
	
	
	public Building() {
		System.out.println("non paramitarised comstructor");
		
	}
	public Building(String name,int flateNum) {
		this.name=name;
		this.flateNum=flateNum;	
	}
     public Building(float price, String area, String state) {
         this.area=area;
    	 this.price=price;
    	 this.state=state;
    	
     }
     public Building(int flateNum, String area, String state) {
    	 this.flateNum=flateNum;
    	 this.area=area;
    	 this.state=state;	 
     }
     
     public Building(int flateNum,float price) {
    	 this.flateNum=flateNum;
    	 this.price=price;
    	 
     }
     public Building(String name,int flateNum,float price,String area,String state)
     {
    	this(flateNum,area,state); 
    	this.name=name;
    	this.flateNum=flateNum;
    	this.price=price;
    	this.area=area;
    	this.state=state;
    	
     }
     
     public void dispaly() {
    	 
    	 
    	 this.name=name;
    	 this.flateNum=flateNum;
    	 this.price=price;
    	 this.area=area;
    	 this.state=state;
    	 
     }
     public void Runner() {
    	 System.out.println();
    	 System.out.println("name-----"+this.name);
    	 System.out.println("flateNum----"+this.flateNum);
    	 System.out.println("price----"+this.price);
    	 System.out.println("area----"+this.area);
    	 System.out.println("state----"+this.state);
    	 
     }
     
}
