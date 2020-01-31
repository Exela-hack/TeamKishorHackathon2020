package com.example.HackathonEvent.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HackathonEvent.dao.UserDAO;
import com.example.HackathonEvent.model.User;
import com.example.HackathonEvent.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService{

	@Autowired
	UserDAO userDao;
	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

}
