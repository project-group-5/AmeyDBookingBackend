package com.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.units.qual.min;
@Entity

public class BookingDetails {
	@Id
	@GeneratedValue
	private int bookingId;
	@org.springframework.lang.NonNull
	private Date  bookingDate;
	private int seatnumber;
	@Max
	@min
	private int seatcost;
	private String seattype;
	
	private String seatcolour;
	
    public BookingDetails() {
		
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public int getSeatnumber() {
		return seatnumber;
	}

	public void setSeatnumber(int seatnumber) {
		this.seatnumber = seatnumber;
	}

	public int getSeatcost() {
		return seatcost;
	}

	public void setSeatcost(int seatcost) {
		this.seatcost = seatcost;
	}

	public String getSeattype() {
		return seattype;
	}

	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}

	public String getSeatcolour() {
		return seatcolour;
	}

	public void setSeatcolour(String seatcolour) {
		this.seatcolour = seatcolour;
	}
    
    



}
