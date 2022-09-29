package com.springboot.airportRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.airportmodel.Airport;



public interface AirportRepository extends JpaRepository<Airport,Long>{

}
	


