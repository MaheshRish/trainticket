package com.trainticket.service;

import org.springframework.stereotype.Service;

@Service
public interface BookingService {
	
	 String bookTicket(String trainNumber, String username);
	    boolean cancelTicket(String trainNumber, String username);

}
