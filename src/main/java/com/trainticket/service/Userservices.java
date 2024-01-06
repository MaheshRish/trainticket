package com.trainticket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trainticket.model.User;
import com.trainticket.repository.UserRepository;

@Service
public class Userservices {
	
	@Autowired
	 private UserRepository userrepo;
	
	public User saveDetails(User user) {
		return userrepo.save(user);
		
	}

}
