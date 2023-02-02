package com.xworkz.boot;

import com.xworkz.things.Rainbow;


public class RainbowRunner {
	
	public static void main(String[] args) {
		Rainbow rainbow = new Rainbow("Red", true, "Yellow", 4, "Blue", "Indigo", "Violet");
		rainbow.DisplayRainbow();
	}


}
