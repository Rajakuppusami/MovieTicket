package com.movieticket.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class mainMovie {
	public static void main(String[] args) throws ParseException {
		Scanner sc=new Scanner(System.in);
		//Movie movie=new Movie();
		System.out.println("Enter movie name : ");
		String movieName=sc.nextLine();
		
		System.out.println("Choose Movie Type as given below ");
		for (MovieType movietype : MovieType.values()) { 
            System.out.println(movietype); 
        }
		MovieType movieType=MovieType.valueOf(sc.nextLine().toUpperCase());
		
		System.out.println("Choose Movie Language as given below ");
		for (MovieLanguage movielang : MovieLanguage.values()) { 
            System.out.println(movielang); 
        }
		MovieLanguage movieLanguage=MovieLanguage.valueOf(sc.nextLine().toUpperCase());	
		//System.out.println("Movie Name :"+moviename+ " movie Type : "+movieType+" movie Lnguage : "+movieLanguage);
		
		System.out.println("Enter Movie Release data : dd/mm/yyyy");
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/yyyy");
		Date movieReleaseDate =dateFormat.parse(sc.nextLine());
		//System.out.println("Movie Name :"+moviename+ " movie Type : "+movieType+" movie Lnguage : "+movieLanguage+" Movie Release Date : "+movieReleaseDate);
		
		System.out.println("Enter movie Actor name : ");
		String movieActorName=sc.nextLine();
		
		System.out.println("Enter movie Actress name : ");
		String movieActressName=sc.nextLine();
		
		System.out.println("Enter movie Director name : ");
		String movieDirectorName=sc.nextLine();
		
		System.out.println("Enter movie Writer name : ");
		String movieWriterName=sc.nextLine();
		
		System.out.println("Enter movie Producer name : ");
		String movieProducerName=sc.nextLine();
		
		System.out.println("Enter movie ProductionCompany name : ");
		String movieProductionCompany=sc.nextLine();
		
		MovieDescription movieDescription=new MovieDescription(movieActorName, movieActressName, movieDirectorName, movieWriterName, movieProducerName, movieProductionCompany);
		Movie movie=new Movie(movieName, movieType, movieLanguage, movieReleaseDate, movieDescription);
		System.out.println(movie.toString());
		
		
	}
	
}
