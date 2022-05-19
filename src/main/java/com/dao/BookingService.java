package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.BookingDetails;

@Service


public class BookingService {
	@Autowired
	BookingDAO bookingDAOImpl;

	public void add(BookingDetails booking) {
		bookingDAOImpl.addBooking(booking);
		
	}
	public BookingDetails find(int bookingId) {
		return bookingDAOImpl.findBooking(bookingId);
	}
	public List<BookingDetails> findAll(){
		return bookingDAOImpl.findAllBooking();
	}
	public boolean update(BookingDetails booking) {
		return bookingDAOImpl.updateBooking(booking);
	}
	public boolean delete(int bookingId) {
		return bookingDAOImpl.deleteBooking(bookingId);
	}



}