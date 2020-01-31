package com.example.HackathonEvent.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.HackathonEvent.model.User;

@Repository
public interface UserDAO extends MongoRepository<User,String>{

}
