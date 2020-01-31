package com.example.HackathonEvent.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document
@Data
public class Team {

	@Id	
	private String id;
	
	@Field(value="title")
	private String title;
	
	@Field(value="event_id")
	private Event event;
	
	@Field(value="users")
	private List<User> users;
	
    @Field(value="createdon")
	private LocalDateTime createdOn;
    
    @Field(value="isActive")
	private boolean isActive;
}
