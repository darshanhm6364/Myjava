class Theater{
	static String name;
	static long ticketPrice;
	static String ownerName;
	static String location;
	static String type;
	
	
	static void theaterDetails(String theaterName,long Price, String owner,String place,String screen)
	{
		name=theaterName;
		ticketPrice=Price;
		ownerName=owner;
		location=place;
		type=screen;
	}
	static void Display(){
		
		System.out.println(" Theater name  is"+" "+name);
		System.out.println(" Ticket price  is"+" "+ticketPrice);
		System.out.println(" owner  is"+" "+ownerName);
		System.out.println("location  is"+" "+location);
		System.out.println(" Type of screen is"+" "+type);
		
	}
}