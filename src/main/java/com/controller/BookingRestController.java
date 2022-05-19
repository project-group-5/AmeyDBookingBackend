package com.controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.dao.BookingService;
	import com.model.BookingDetails;

	@RestController
	public class BookingRestController {
	@Autowired
	BookingService service;

	@GetMapping("/getbookings")
	public List<BookingDetails> findall() {
		return service.findAll();
	}
	public String add(BookingDetails b) {
		service.add(b);
		return "Booking added successfully";
	}
	}


