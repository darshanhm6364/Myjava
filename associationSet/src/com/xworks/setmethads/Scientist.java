package com.xworks.setmethads;

public class Scientist {
	
	public String name;
	public String designation;
	
	
	public void setName(String name) {
		this .name=name;
		}
	
	public void setDesignation(String designation ) {
     this.designation=designation;		
	} 
	 public void display(String name,String designation ) {
		 
		 System.out.println("scientist "  +name);
		 System.out.println("scientist "   +designation); 
		 
	 }
	

}
