package com.xworks.ossociation;

public class CarramBord {
	
	
	public int players;
	public String Colour;
	public int pans;

	
	
	
	public void init(int players,String colour,int pans) {
		
		this.players=players;
		this.Colour=Colour;
		this.pans=pans;
		
		
	}
	
	public void display() {
		
		System.out.println("number of players"+players);
		System.out.println("carrambord colour"+Colour);
		System.out.println("no of pans"  +pans);

	}

}
   
