package com.xworkz.methods.costing;

public class Device {
	
	private String name;
	
	public Device() {
		System.out.println("no argument with constractar");
	}
	
	public Device(String name) {
		this.name=name;
		System.out.println("String arg const in device");
	}
	public void operate() {
		System.out.println("running opertator of device");
	}
	public String getName() {
     return name;

}
}