package com.springboot.flightmanagementsystem.Servicelayer;
import java.util.List;

import com.springboot.flightmanagementsystem.Dtolayer.Flight;


public interface FlightService {
	
	//save
	Flight saveFlight(Flight flight);
	//findAll
	List<Flight> getAllFlights();
	//find
	Flight getFlightById(long flightNumber);
	//update
	Flight updateFlight(Flight flight,long flightNumber);
	//delete
	void deleteFlight(long flightNumber);

}
