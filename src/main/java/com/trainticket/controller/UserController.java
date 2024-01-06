package com.trainticket.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trainticket.model.User;
import com.trainticket.service.Userservices;

@RestController
public class UserController {

   @Autowired
   private Userservices userservices;
   
   @PostMapping("Adduser")
   public User postDetails(@RequestBody User user) {
	return  userservices.saveDetails(user);
	   
   }


}
