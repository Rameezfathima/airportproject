package com.springboot.flightmanagementsystem.Servicelayer;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.flightmanagementsystem.Daolayer.FlightRepository;
import com.springboot.flightmanagementsystem.Dtolayer.Flight;
import com.springboot.flightmanagementsystem.Exception.ResourceNotFoundException;



@Service
public class FlightServiceImpl implements FlightService{
	
	@Autowired
	private FlightRepository flightRepository;

	public FlightServiceImpl(FlightRepository flightRepository) {
		super();
		this.flightRepository = flightRepository;
	}

	@Override
	public Flight saveFlight(Flight flight) {
		return flightRepository.save(flight);
	}

	@Override
	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}

	@Override
	public Flight getFlightById(long flightNumber) {
		return flightRepository.findById(flightNumber).orElseThrow(()->
		new ResourceNotFoundException("Flight","Number",flightNumber));
	}

	@Override
	public Flight updateFlight(Flight flight, long flightNumber) {
		Flight exist=flightRepository.findById(flightNumber).orElseThrow(()->
		new ResourceNotFoundException("Flight","Number",flightNumber));
		
		
		exist.setFlightModel(flight.getFlightModel());
		exist.setCarrierName(flight.getCarrierName());
		exist.setSeatCapacity(flight.getSeatCapacity());
		
		flightRepository.save(exist);
		return exist;
		
	}

	@Override
	public void deleteFlight(long flightNumber) {
		flightRepository.findById(flightNumber).orElseThrow(()->
		new ResourceNotFoundException("Flight","Number",flightNumber));
		flightRepository.deleteById(flightNumber);
	}
}
