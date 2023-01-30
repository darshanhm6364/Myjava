package com.xworkz.darshu;
public class FilmRunner {
	
	public static void main(String[] args) {
		
		Film ref=new Film();
		System.out.println(ref.movieName );
		System.out.println(ref .moviePrice);
		System.out.println(ref.heroName);
		System.out.println(ref.heroinName);
		System.out.println(ref.SongName);
		
		
		ref.movieName="patan";
		ref.moviePrice=200;
		ref.heroName="shah rukh khan";
		ref.heroinName="deepika padukone";
		ref.SongName="Besharam rang";
		
		System.out.println(ref.movieName );
		System.out.println(ref .moviePrice);
		System.out.println(ref.heroName);
		System.out.println(ref.heroinName);
		System.out.println(ref.SongName);
		
		
	}
	

}
