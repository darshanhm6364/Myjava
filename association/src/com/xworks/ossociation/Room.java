package com.xworks.ossociation;

public class Room {
	
	
	public String name;
	public int student;
	public int noOfChairs;
	
	
	public void init(String name, int student,int noOfChairs) {
	this.name=name;
	this.student=student;
	this.noOfChairs=noOfChairs;
	
		
	}
	public void display() {
		 System.out.println("room name is ----"+name);
		 System.out.println("number of student  --"+student);
		 

		 System.out.println("chairs in room----"+noOfChairs);

	}

}
