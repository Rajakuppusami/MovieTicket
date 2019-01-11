package com.movieticket.main;

public class ScreenSeats {
	private String screenName;
	private int noOfRows;
	private int noOfColumns;
	private SeatType seatType;
	private String seatSequence;
	
	public ScreenSeats(String screenName, int noOfRows, int noOfColumns, SeatType seatType, String seatSequence) {
		this.screenName = screenName;
		this.noOfRows = noOfRows;
		this.noOfColumns = noOfColumns;
		this.seatType = seatType;
		this.seatSequence = seatSequence;
	}
	
	public String getScreenName() {
		return screenName;
	}
	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}
	public int getNoOfRows() {
		return noOfRows;
	}
	public void setNoOfRows(int noOfRows) {
		this.noOfRows = noOfRows;
	}
	public int getNoOfColumns() {
		return noOfColumns;
	}
	public void setNoOfColumns(int noOfColumns) {
		this.noOfColumns = noOfColumns;
	}
	public SeatType getSeatType() {
		return seatType;
	}
	public void setSeatType(SeatType seatType) {
		this.seatType = seatType;
	}
	public String getSeatSequence() {
		return seatSequence;
	}
	public void setSeatSequence(String seatSequence) {
		this.seatSequence = seatSequence;
	}

	@Override
	public String toString() {
		return "ScreenSeats [screenName=" + screenName + ", noOfRows=" + noOfRows + ", noOfColumns=" + noOfColumns
				+ ", seatType=" + seatType + ", seatSequence=" + seatSequence + "]";
	}
	
	
}
