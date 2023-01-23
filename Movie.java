class Movie{
	static String name;
	static long budget;
	static String directorName;
	static String heroName;
	static String heroinName;
	static int noOfSongs;
	
	static void movieDetails(String movieName,long movieBudget, String movieDirectorName,String movieHeroName,String movieHeroinName,int movieNoOfSongs)
	{
		name=movieName;
		budget=movieBudget;
		directorName=movieDirectorName;
		heroName=movieHeroName;
		heroinName=movieHeroinName;
		noOfSongs=movieNoOfSongs;
	}
	static void Display(){
		
		System.out.println(" movie name  is"+" "+name);
		System.out.println(" movie budget  is"+" "+budget);
		System.out.println(" movie director  is"+" "+directorName);
		System.out.println(" movie hero  is"+" "+heroName);
		System.out.println(" movie heroin is"+" "+heroinName);
		System.out.println(" movie songs are"+" "+noOfSongs);
	}
}