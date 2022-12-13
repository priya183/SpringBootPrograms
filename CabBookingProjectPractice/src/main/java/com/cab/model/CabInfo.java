package com.cab.model;

import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Entity
public class CabInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int id;
	@NotEmpty
	@Size(min=3, message="Driver name should be minimum of 3 characters.")
	public String driverName;
	@NotEmpty
	public int vehicleNumber;
	@NotEmpty(message="Vehicle type should not be empty.")
	public String vehicleType;
	@NotEmpty(message="sourceLocation should not be empty.")
	public String sourceLocation;
	@NotEmpty(message="destinationLocation should not be empty.")
	public String destinationLocation;
	@NotEmpty(message="Time should not be empty.")
	public  Time time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public int getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getSourceLocation() {
		return sourceLocation;
	}
	public void setSourceLocation(String sourceLocation) {
		this.sourceLocation = sourceLocation;
	}
	public String getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(String destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}	
	
	

}
