package com.sample.Booking;
import java.sql.Date;
import org.junit.*;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dao.BookingService;
import com.model.BookingDetails;
@SpringBootTest
class BookingTest {
	@Autowired
	BookingService service;

	@Test
	void addtest() {
		BookingDetails b = new BookingDetails();
		b.setSeatnumber(123);
		b.setBookingId(124);
		String str="2022-04-12";
		Date d=Date.valueOf(str);
		String str1="2022-04-14";
		Date d1=Date.valueOf(str1);
		b.setBookingDate(d);
		service.add(b);
		BookingDetails b1=service.find(b.getBookingId());
		Assertions.assertEquals(123,b1.getSeatnumber());
		Assertions.assertEquals(124,b1.getBookingId());
		 
	}
	
	@Test
	void delete() {
		BookingDetails b1=new BookingDetails();
		service.add(b1);
		service.delete(1);
		BookingDetails b2 = service.find(1);
		Assertions.assertNull(b2);
		
	}
	
	@Test
	void update() {
		BookingDetails b = new BookingDetails();
		b.setSeatnumber(1256);
		String str ="2022-04-01";
		Date d = Date.valueOf(str);
		b.setBookingDate(d);
		b.setBookingId(111);
		service.add(b);
		b.setSeatnumber(123567);
		service.update(b);
		Assertions.assertEquals(true,service.update(b));
	}
	@Test
	void findAllBookings() {
		BookingDetails b = new BookingDetails();
		String str="2022-04-1";
		Date d=Date.valueOf(str);
		b.setBookingDate(d);
		b.setSeatnumber(1);
		b.setBookingId(11);
		service.add(b);
		BookingDetails b1 = new BookingDetails();
		String str2="2022-04-12";
		Date d2=Date.valueOf(str2);
		b1.setBookingDate(d2);
		b1.setSeatnumber(12);
		b1.setBookingId(112);
		service.add(b1);
		BookingDetails b2 = new BookingDetails();
		String str4="2022-04-12";
		Date d4=Date.valueOf(str4);
		b2.setBookingDate(d4);
		
		b2.setSeatnumber(122);
		b2.setBookingId(1122);
		service.add(b2);
		List<BookingDetails> bookinglist=service.findAll();
		Assertions.assertEquals(123, bookinglist.get(0).getSeatnumber());
	}
	@Test
	void findBooking() {
		BookingDetails b = new BookingDetails();
		String str="2022-04-10";
		Date d=Date.valueOf(str);
		b.setBookingDate(d);
		b.setSeatnumber(12345);
		b.setBookingId(111);
		service.add(b);
		BookingDetails b1=service.find(b.getBookingId());
		Assertions.assertEquals(111,b1.getBookingId());
	}
}