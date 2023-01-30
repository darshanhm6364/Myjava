package com.xworkz.darshu;
public class FanRunner {
	
  public static void main(String[]args) {
	  
	  Fan ref=new Fan();
	  
	  System.out.println(ref.price);
	  System.out.println(ref.brand);
	  System.out.println(ref.colour);
	  
	  
	  ref.price = 999;
	  ref.brand ="V-Gaurd";
	  ref.colour ="White";
	  
	  System.out.println(ref.price);
	  System.out.println(ref.brand);
	  System.out.println(ref.colour);
	  
	  
  }
	

}
