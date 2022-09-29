package com.springboot.flightmanagementsystem.Daolayer;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.flightmanagementsystem.Dtolayer.Booking;



@Repository
public interface BookRepository extends JpaRepository<Booking,Long>{

	

}

