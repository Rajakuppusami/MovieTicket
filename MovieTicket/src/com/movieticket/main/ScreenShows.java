package com.movieticket.main;

import java.time.LocalTime;

public class ScreenShows {
	
	private String screenName;
	private Shows shows;
	private LocalTime time;
	
	public ScreenShows(String screenName, Shows shows, LocalTime time) {
		this.screenName = screenName;
		this.shows = shows;
		this.time = time;
	}
	
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public Shows getShows() {
		return shows;
	}
	public void setShows(Shows shows) {
		this.shows = shows;
	}
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	
	@Override
	public String toString() {
		return "ScreenShows [screenName=" + screenName + ", shows=" + shows + ", time=" + time + "]";
	}
	
	
}
