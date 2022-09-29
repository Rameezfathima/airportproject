package com.springboot.flightmanagementsystem.Servicelayer;
import java.util.List;

import com.springboot.flightmanagementsystem.Dtolayer.Passenger;



public interface PassengerService {
	//save
    Passenger savePassenger(Passenger passenger);
    //findAll
    List<Passenger> getAllPassengers();
    //find
    Passenger getPassengerById(long pnrNumber);
    //update
    Passenger updatePassenger(Passenger passenger,long pnrNumber);
    //delete
    void deletePassenger(long pnrNumber);
}
