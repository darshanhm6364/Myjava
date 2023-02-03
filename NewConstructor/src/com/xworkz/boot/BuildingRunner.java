package com.xworkz.boot;
import com.xworkz.things.Building;

public class BuildingRunner {
	
	public static void main(String[] args) {
		
		Building d=new Building("darshan",46);
		Building d1=new Building(4570000,"bng","karnataka");
		Building d2=new Building(46,"bng","karnataka");
		Building d3=new Building(46,4570000);
		Building d4=new Building("darshan",46,4570000,"bng","karnataka");
		 d.Runner();	 
		 d1.Runner();
		 d2.Runner();
		 d3.Runner();
		 d4.Runner();
	}

}
