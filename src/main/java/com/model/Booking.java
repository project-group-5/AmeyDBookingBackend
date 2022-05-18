package com.model;

import java.sql.Date;

import javax.persistence.*;

@Entity
public class Booking {
	@Id
	@GeneratedValue
    private int bookingId;
	private int seatId;
	private int userId;
	private Date bookDate;
	private Date travelDate;
	public Booking() {}
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getSeatId() {
		return seatId;
	}
	public void setSeatId(int showId) {
		this.seatId = showId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getBookDate() {
		return bookDate;
	}
	public void setBookDate(Date bookDate) {
		this.bookDate = bookDate;
	}
	public Date getTravelDate() {
		return travelDate;
	}
	public void setTravelDate(Date showDate) {
		this.travelDate = showDate;
	}
	
	

}
