package com.example.HackathonEvent.model;

import java.time.LocalDateTime;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
 
@Document
@Data
public class User {
	@Id
	private String id;
	
	@Field
	private String name;

	@Field(value="mobile")
	private String mobile;
	
	@Field(value="email")
	private String email;
	
	@Field(value="password")
	private String password;
	
	@Field(value="address")
	private String address;
	
	@Field(value="role")
	private String role;
	
    @Field(value="createdon")	
	private LocalDateTime createdOn;
    
    @Field(value="isActive")
	private boolean isActive;
    
    @Field
    private String imagepath;
	
	
}
