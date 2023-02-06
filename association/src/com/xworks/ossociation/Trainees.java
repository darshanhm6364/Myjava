package com.xworks.ossociation;

public class Trainees {

	public String name;
	public int age;
	public String located;
	public WaterBottle wb = new WaterBottle();
	public Battery b=new Battery();
	public Chair c=new Chair();
	public Room R=new Room();
	public CarramBord CB=new CarramBord();
	

	
	// public Trainees(String string, int i, String string2) {
	// TODO Auto-generated constructor stub
	// }

	public void init(String name, int age, String located) {

		this.name = name;
		this.age = age;
		this.located = located;

	}

	public void display() {

		System.out.println("trainerr name is----- " + name);
		System.out.println("trainer age is----" + age);
		System.out.println("trainer located in" + located);
		this.wb.display();
		this.b.display();
		this.c.display();
		this.R.display();
		this.CB.display();
		
	}

}
