package com.springboot.flightmanagementsystem.Dtolayer;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fli_ght")
public class Flight {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long flightNumber;
	@Column(name="fl_model")
	private String flightModel;
	@Column(name="car_name")
	private String carrierName;
	@Column(name="seat_capacity")
	private int seatCapacity;

	public Flight() {
		super();
		
	}

	public Flight(long flightNumber, String flightModel, String carrierName, int seatCapacity) {
		super();
		this.flightNumber = flightNumber;
		this.flightModel = flightModel;
		this.carrierName = carrierName;
		this.seatCapacity = seatCapacity;
	}

	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getFlightModel() {
		return flightModel;
	}

	public void setFlightModel(String flightModel) {
		this.flightModel = flightModel;
	}

	public String getCarrierName() {
		return carrierName;
	}

	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}

	public int getSeatCapacity() {
		return seatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		this.seatCapacity = seatCapacity;
	}
}
