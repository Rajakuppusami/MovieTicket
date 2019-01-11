package com.movieticket.main;

public class MovieDescription {
	
	private String movieActorName;
	private String movieActressName;
	private String movieDirectorName;
	private String movieWriterName;
	private String movieProducerName;
	private String movieProductionCompany;
	
	public MovieDescription(String movieActorName, String movieActressName, String movieDirectorName, String movieWriterName,  String movieProducerName, String movieProductionCompany){
		this.movieActorName=movieActorName;
		this.movieActressName=movieActressName;
		this.movieDirectorName=movieDirectorName;
		this.movieProducerName=movieProducerName;
		this.movieProductionCompany=movieProductionCompany;
	}
	
	public String getMovieActorName() {
		return movieActorName;
	}
	public void setMovieActorName(String movieActorName) {
		this.movieActorName = movieActorName;
	}
	public String getMovieActressName() {
		return movieActressName;
	}
	public void setMovieActressName(String movieActressName) {
		this.movieActressName = movieActressName;
	}
	public String getMovieDirectorName() {
		return movieDirectorName;
	}
	public void setMovieDirectorName(String movieDirectorName) {
		this.movieDirectorName = movieDirectorName;
	}
	public String getMovieWriterName() {
		return movieWriterName;
	}
	public void setMovieWriterName(String movieWriterName) {
		this.movieWriterName = movieWriterName;
	}
	public String getMovieProducerName() {
		return movieProducerName;
	}
	public void setMovieProducerName(String movieProducerName) {
		this.movieProducerName = movieProducerName;
	}
	public String getMovieProductionCompany() {
		return movieProductionCompany;
	}
	public void setMovieProductionCompany(String movieProductionCompany) {
		this.movieProductionCompany = movieProductionCompany;
	}
	
	@Override
	public String toString() {
		return "MovieDescription [movieActorName=" + movieActorName + ", movieActressName=" + movieActressName
				+ ", movieDirectorName=" + movieDirectorName + ", movieWriterName=" + movieWriterName
				+ ", movieProducerName=" + movieProducerName + ", movieProductionCompany=" + movieProductionCompany
				+ "]";
	}
	
	
}
