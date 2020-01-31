package com.example.HackathonEvent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.HackathonEvent.model.User;
import com.example.HackathonEvent.service.AuthService;

@RestController
@RequestMapping(value="/auth")
public class AuthController {

	@Autowired
	AuthService authService;
	
	@RequestMapping(value="/get" , method = RequestMethod.POST)
	public ResponseEntity<User> getString(@RequestBody User user) {
		User u = authService.createUser(user);
		return new ResponseEntity<User>(u,HttpStatus.OK);
	}
}
