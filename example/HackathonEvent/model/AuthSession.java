package com.example.HackathonEvent.model;

import java.time.LocalDateTime;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document
@Data
public class AuthSession {

	@Id	
	private String id;
	
	@Field(value="username")
	private String username;
	
	@Field(value="content")
	private String content;
	
	@Field(value="createdOn")
	private LocalDateTime createdOn;
	
	@Field(value="isActive")
	private boolean isActive;

	                 
}	


