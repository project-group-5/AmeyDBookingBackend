package com.dao;

import java.util.List;


import org.springframework.stereotype.Repository;

import com.model.BookingDetails;

@Repository
public interface BookingDAO {
	 public void addBooking(BookingDetails booking);
	 public BookingDetails findBooking(int bookingId);
	 public List<BookingDetails> findAllBooking();
	 public boolean updateBooking(BookingDetails booking);
	 public boolean deleteBooking(int bookingId);

	

}