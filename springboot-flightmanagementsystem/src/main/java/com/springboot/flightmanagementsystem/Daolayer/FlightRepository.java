package com.springboot.flightmanagementsystem.Daolayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.flightmanagementsystem.Dtolayer.Flight;


@Repository
public interface FlightRepository extends JpaRepository<Flight,Long> {

}
