package com.springboot.flightmanagementsystem.Daolayer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.flightmanagementsystem.Dtolayer.Passenger;



@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>{

}

