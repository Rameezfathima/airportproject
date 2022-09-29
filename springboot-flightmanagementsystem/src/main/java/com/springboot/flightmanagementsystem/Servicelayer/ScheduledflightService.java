package com.springboot.flightmanagementsystem.Servicelayer;

import java.math.BigInteger;
import java.util.List;

import com.springboot.flightmanagementsystem.Dtolayer.Scheduledflight;



public interface ScheduledflightService {
	Scheduledflight saveScheduledflight(Scheduledflight scheduledflight);
	
	List<Scheduledflight> getAllScheduledflights();
	
    Scheduledflight getScheduledflightById(BigInteger id);
    
    Scheduledflight updateScheduleflight(Scheduledflight scheduledflight,BigInteger id);
    
    void deleteScheduledflight(BigInteger id);
}