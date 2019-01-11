package com.movieticket.main;

import java.util.Date;

public class Movie {
	
	private String movieName;
	private MovieType movieType;
	private MovieLanguage movieLanguage;
	private Date movieReleaseDate;
	private MovieDescription movieDescription;
	
	public Movie(String movieName, MovieType movieType, MovieLanguage movieLanguage, Date movieReleaseDate, MovieDescription movieDescription) {
		this.movieName=movieName;
		this.movieType=movieType;
		this.movieLanguage=movieLanguage;
		this.movieReleaseDate=movieReleaseDate;
		this.movieDescription=movieDescription;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public MovieType getMovieType() {
		return movieType;
	}
	public void setMovieType(MovieType movieType) {
		this.movieType = movieType;
	}
	public MovieLanguage getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(MovieLanguage movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public Date getMovieReleaseDate() {
		return movieReleaseDate;
	}
	public void setMovieReleaseDate(Date movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}
	public MovieDescription getMovieDescription() {
		return movieDescription;
	}
	public void setMovieDescription(MovieDescription movieDescription) {
		this.movieDescription = movieDescription;
	}
	
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieType=" + movieType + ", movieLanguage=" + movieLanguage
				+ ", movieReleaseDate=" + movieReleaseDate + ", movieDescription=" + movieDescription + "]";
	}
	
	
	
}
