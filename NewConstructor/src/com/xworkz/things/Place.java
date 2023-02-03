package com.xworkz.things;

public class Place {

	public String name;
	public long population;
	public String dist; 
	public String state;
	public String country;
	
	public Place() {
		System.out.println("non paramitarised comstructor");
	}
	public Place(String name, long population){
		this.name=name;
		this.population=population;
	} 
	public Place(String dist, String country,String name,long population) {   
		this.dist=dist;
	    this.country=country;
	}
	public Place(String name,long population, String country ) {
	    
		this(name,population);
		this.country=country;
		
	}
	
	public void display() {
		
		this.name=name;
		this.population=population;
		this.dist=dist;
		this.state=state;
		this.country=country;
		
	}
	
	public void runner() {
		System.out.println();
		System.out.println("name --"+this.name);
		System.out.println("population --"+this.population);
		System.out.println("dist --"+this.dist);
		System.out.println("state --"+this.state);
		System.out.println("country --"+this.country);
	}
}
