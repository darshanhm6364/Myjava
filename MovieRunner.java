class MovieRunner
{
	public static void main(String args[])
	{
		Movie.Display();
		Movie.movieDetails("Asuran",2500000000L,"Vetrimaran","Dhanush","Manju Warior",4);
		System.out.println("--------After initialization------");
		Movie.Display();
	}
}