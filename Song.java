class Song{
	static String name;
	static String singer;
	static String language;
	static float duration;
	
	
	static void songDetails(String songName,float time, String vocals ,String lang)
	{
		name=songName;
		duration=time;
		singer=vocals;
		language=lang;
		
	}
	static void Display(){
		
		System.out.println(" Song name  is"+" "+name);
		System.out.println(" Song duration  is"+" "+duration);
		System.out.println(" Singer name  is"+" "+singer);
		System.out.println("language  is"+" "+language);
	
		
	}
}