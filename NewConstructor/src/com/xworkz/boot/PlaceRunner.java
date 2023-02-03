package com.xworkz.boot;
import com.xworkz.things.Place;
public class PlaceRunner {

	public static void main(String[] args) {
		Place p = new Place("Shivamogga",2500000l);
		Place p1=new Place("Bengaluru",1000000000l,"India");
		Place p2 = new Place("Bagalkot","India","mudhol",25000000l);
		
		p.display();
		p.runner();
		p1.runner();
		p2.runner();
	}
}
