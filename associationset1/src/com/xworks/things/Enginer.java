package com.xworks.things;

public class Enginer {
	

	public String name;
	public double salary;
	public String[] skills;
	public Degree[] degrees;
	
	public Enginer()
	{
		
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	
	public  void setSkills(String[] skills) {
		this.skills = skills;
	}
	public void setDegree(Degree[] degrees) {
		this.degrees=degrees;
	}
	public void display()
	{
		System.out.println("Enginer name:"+this.name);
		System.out.println("Enginer salary:"+this.salary);
			if(this.skills!=null) {
			for(int seq=0;seq<this.skills.length;seq++) {
				String element=this.skills[seq];
				System.out.println("skills:"+element+" at index "+seq);
			}
		}
		else {
			System.err.println("this.skills is null");
		}
			

		if(this.degrees!=null) {
			for(int seq=0;seq<this.degrees.length;seq++) {
				Degree element=this.degrees[seq];
				System.out.println("Degree at index:"+seq);
				element.show();
			}
		}
		else {
			System.err.println("this.degree is null");
		}
		System.out.println("------------");
		
}

}
