package polymorphism;

public class Box {
 public static void store(int money) {
	 System.out.println("store money" + money);
 }
 public static void store(String bangle) {
	 System.out.println("store bangle" +"bangle");

 }
  public static void store(String powder,String cream) {
	  System.out.println("store powdeer" +"powder"   +"store cream" +  "cream");
 
  }  
  public static void store(boolean charger , boolean mobile) {
	  System.out.println("store charger" +charger   +"store mobile" +mobile);
	  
  }
  public static void store(int money, String pendrive, int card) {
	  System.out.println("store money" +money  +"store pendrive" +pendrive   +"store card" +card);
	  
	  
  }
}

 