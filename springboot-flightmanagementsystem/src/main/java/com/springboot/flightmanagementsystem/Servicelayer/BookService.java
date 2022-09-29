package com.springboot.flightmanagementsystem.Servicelayer;
import java.util.List;

import com.springboot.flightmanagementsystem.Dtolayer.Booking;



public interface BookService {
	//save
	Booking saveBooking(Booking booking);
//VIEW SINGLE BOOKING
	Booking getBookingById(long id);
	//FIND ALL
	List<Booking>getAllBookings();
	//update booking
	Booking updateBooking(Booking booking,long id);
	//delete booking
	void deleteBooking(long id);
	
	
	
 
}

