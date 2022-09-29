package com.springboot.flightmanagementsystem.Servicelayer;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import com.springboot.flightmanagementsystem.Daolayer.BookRepository;
import com.springboot.flightmanagementsystem.Dtolayer.Booking;
import com.springboot.flightmanagementsystem.Exception.ResourceNotFoundException;


@Service
public class BookImp implements BookService {
	@Autowired
	private BookRepository bookRepository;

	public BookImp(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public Booking saveBooking(Booking booking) {
		
		return bookRepository.save(booking);
	}
	@Override
	public Booking getBookingById(long id) {
		
		return bookRepository.findById(id).orElseThrow( ()->
		new ResourceNotFoundException("Booking","Id",id));}
	@Override

	public Booking updateBooking(Booking booking,long id) {
	Booking existingBooking=bookRepository.findById(id).orElseThrow( ()->
	new ResourceNotFoundException("Booking","Id",id));

		existingBooking.setBookingdate(booking.getBookingdate());
		existingBooking.setTicketcost(booking.getTicketcost());
		existingBooking.setNoofpassengers(booking.getNoofpassengers());
		bookRepository.save(existingBooking);
				return existingBooking;
	}
	
	@Override
	public void deleteBooking(long id) {
		
		bookRepository.findById(id).orElseThrow( ()->
		new ResourceNotFoundException("Booking","Id",id));
		bookRepository.deleteById(id);
		
		
	}
	@GetMapping
	public List<Booking> getAllBookings(){
		return bookRepository.findAll();
	}
	

}

