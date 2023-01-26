package polymorphism;

public class Person {
	
	
	public static void buy(int money) {
		System.out.println("buy mobile"  +"mobile"  +"buy money"  +money);
	}
	 public static void buy(String food, int quantity) {
		 System.out.println("buy food"  +"food"   +"buy quantity in kg"   +"quantity");
	 }
	 
	 public static void buy(String dress, boolean shoes, float belt) {
		 System.out.println("buy dress"  +"dress"    +"buy shoes"   +shoes  +"buy belt"  +belt    );
	 }
	 
	 public static void buy(String bag, String watch ) {
		 System.out.println("buy bag"  +"bag"    +"buy watch"  +watch);
	 }

}
