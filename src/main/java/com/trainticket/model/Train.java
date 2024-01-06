package com.trainticket.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Data
@Table(name = "train")
public class Train {
	@Id
	@GeneratedValue
	private int tid;
	private String trainNumber;
    private String startplace ;
    private String destination;
    private int availableSeats;
    private double pricepaid;
    
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTrainNumber() {
		return trainNumber;
	}
	/**
	 * @return the pricepaid
	 */
	public double getPricepaid() {
		return pricepaid;
	}
	/**
	 * @param pricepaid the pricepaid to set
	 */
	public void setPricepaid(double pricepaid) {
		this.pricepaid = pricepaid;
	}
	public void setTrainNumber(String trainNumber) {
		this.trainNumber = trainNumber;
	}
	public String getstartplace() {
		return startplace;
	}
	public void setstartplace(String startplace) {
		this.startplace = startplace;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	/**
	 * @param trainNumber
	 * @param source
	 * @param destination
	 * @param availableSeats
	 */
	public Train(String trainNumber, String startplace, String destination, int availableSeats) {
		super();
		this.trainNumber = trainNumber;
		this.startplace = startplace;
		this.destination = destination;
		this.availableSeats = availableSeats;
	}
	
	public Train(double pricepaid) {
		super();
		this.pricepaid = pricepaid;
	}
	/**
	 * @param tid
	 */
	public Train(int tid) {
		super();
		this.tid = tid;
	}
	
    
    

}
