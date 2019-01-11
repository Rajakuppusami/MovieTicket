package com.movieticket.main;

import java.util.Date;

public class Theatres {
	
	private String theatreName;
	private Movie moviename;
	private Screen screenName;
	private Date startDate;
	private Date endDate;
	private Shows show;
	private float ticketamount;
	
	public Theatres(String theatreName, Movie moviename, Screen screenName, Date startDate, Date endDate, Shows show,
			float ticketamount) {
		this.theatreName = theatreName;
		this.moviename = moviename;
		this.screenName = screenName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.show = show;
		this.ticketamount = ticketamount;
	}
	
	public float getTicketamount() {
		return ticketamount;
	}

	public void setTicketamount(float ticketamount) {
		this.ticketamount = ticketamount;
	}

	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
	public Movie getMoviename() {
		return moviename;
	}
	public void setMoviename(Movie moviename) {
		this.moviename = moviename;
	}
	public Screen getScreenName() {
		return screenName;
	}
	public void setScreenName(Screen screenName) {
		this.screenName = screenName;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Shows getShow() {
		return show;
	}
	public void setShow(Shows show) {
		this.show = show;
	}

	@Override
	public String toString() {
		return "Theatres [theatreName=" + theatreName + ", moviename=" + moviename + ", screenName=" + screenName
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", show=" + show + ", ticketamount="
				+ ticketamount + "]";
	}
	
	
}
