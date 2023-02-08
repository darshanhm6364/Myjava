package com.xworks.things;

public class EnginerRunner {
	
public static void main(String args[]) {
		
		Enginer engineer=new Enginer();
		engineer.setName("darshan");
		engineer.setSalary(45000);
		String[] skl={"fast typing","easy learning","solution finding"};
		engineer.setSkills(skl);
		engineer.display();
		
		
	
		Degree degree1=new Degree();
		Degree degree2=new Degree();
		 degree1.setName("BE");
		 degree1.setDuration(3);
		 degree1.setPursuing(true);
		 degree1.setPercentage(69.78D);
		 degree1.setBranch("CS");
		
			degree2.setName("Bcom");
			 degree2.setDuration(3);
			 degree2.setPursuing(true);
			 degree2.setPercentage(80.72D);
			 degree2.setBranch("bca");
			 
			 Degree[] degrees= {degree1,degree2};
			
		
		engineer.setDegree(degrees);
		engineer.display();

}

}
