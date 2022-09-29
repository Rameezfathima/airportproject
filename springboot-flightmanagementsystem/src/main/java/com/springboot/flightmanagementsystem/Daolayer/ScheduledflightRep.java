package com.springboot.flightmanagementsystem.Daolayer;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.flightmanagementsystem.Dtolayer.Scheduledflight;


@Repository
public interface ScheduledflightRep extends JpaRepository<Scheduledflight,BigInteger>{

}