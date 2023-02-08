package com.xworks.setmethads;

public class IsroRunner {
	
	public static void main(String[]args) {
		
		Isro ref=new Isro();
		
		String[]location= {"bengaluru","shimoga","chikkamanglur"};
		ref.setLocation(location);
		int[]satellite= {13,17,7};
		ref.setSatellite(satellite);
		ref.display();
		
		Scientist scientist1=new Scientist();
		Scientist scientist2=new Scientist();
		
		scientist1 .setName("abdul khalam");
		scientist1 .setDesignation("teacher");
		
		scientist2.setName("c v raman");
		scientist2.setDesignation("tecahers");
		
		
		scientist1.display("abdul khalam", "teacher");
		scientist2.display("c v raman","taechers");
		
	}

}
