package com.trainticket.service;

import org.springframework.stereotype.Service;

@Service
public interface AuthenticationService {
	
	boolean authenticateUser(String username, String password);

}
