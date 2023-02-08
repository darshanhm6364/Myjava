package com.xworks.setmethads;

public class Isro {

	public String[] location;
	public int[] satellite;
	public Scientist[] Scientist;

	public Isro() {
		System.out.println("no of argument constaractar");
	}

	public void setLocation(String[] location) {

		this.location = location;

	}

	public void setSatellite(int[] satellite) {
		this.satellite = satellite;
	}

	public void setScientist(Scientist[] Scientist) {
		this.Scientist = Scientist;
	}

	public void display() {
		System.out.println("about isro");
	
	
	if(this.location!=null) {
		for(int seq=0;seq<this.location.length;seq++) {
		String ref=this.location[seq];
		System.out.println("location"  +ref);
		
		
	}
	}else {
		System.out.println("this .location not storing in memory");
			
		}
	if(this.satellite!=null) {
		for(int num=0;num<this.satellite.length;num++) {
			int ref=this.satellite[num];
			System.out.println("satellitr"  +ref);
			
			
		}
	}else {
		System.out.println("this satellite is not sharing");
	}
	if(this.Scientist!=null) {
		for(int seq=0;seq<this.Scientist.length;seq++) {
			Scientist element=this.Scientist[seq];
			this.display();
		}
	}
	
	}
}
