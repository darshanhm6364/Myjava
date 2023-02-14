package com.xworkz.methods;
import com.xworkz.methods.costing.Camera;

public class CameraRunner {
	
	public static void main(String [] args) {
		
        Camera camera=new Camera();
        camera.Capture();
        camera.operate();
        camera.getName();
        
        Camera device=new Camera();
        device.operate();
        device.getName();
        
        Camera cast=(Camera)device;
        cast.Capture();
        
		 
	}

}


