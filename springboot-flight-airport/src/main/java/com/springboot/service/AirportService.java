package com.springboot.service;

	import java.util.List;

import com.springboot.airportmodel.Airport;

	public interface AirportService {
	    
	    
	    Airport saveAirport(Airport airport);
	   List<Airport> getAllAirports();
	    Airport getAirportById(long Id);
	    
	}


