package com.xworkz.darshu;
import com.xworkz.darshu.Zebra;
public class ZebraRunner {
	
	public static void main(String[]args) {
		
		Zebra ref=new Zebra();
		
		System.out.println(ref.age);
		System.out.println(ref.color);
		System.out.println(ref.gender);
		
		
		ref.age=15;
		ref.color="blue";
		ref.gender="male";
		
		
		System.out.println(ref.age);
		System.out.println(ref.color);
		System.out.println(ref.gender);
	}

}
