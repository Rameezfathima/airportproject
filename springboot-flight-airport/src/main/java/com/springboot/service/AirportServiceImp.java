package com.springboot.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.airportRepository.AirportRepository;
import com.springboot.airportexception.ResourceNotFoundException;
import com.springboot.airportmodel.Airport;



@Service
public class AirportServiceImp implements AirportService{
    
    private AirportRepository air;



   public AirportServiceImp(AirportRepository air) {
        super();
        this.air = air;
    }

   @Override
   public Airport saveAirport(Airport airport) {
	   return air.save(airport);
 }

    @Override
    public List<Airport> getAllAirports() {
        return air.findAll();
    }

    @Override
    public Airport getAirportById(long Id) {
        // TODO Auto-generated method stub
        return air.findById(Id).orElseThrow(()->
        new ResourceNotFoundException("Airport","Id",Id));
              
    }
}

