package com.example.HackathonEvent.model;

import java.time.LocalDateTime;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document
@Data
public class FeedBack {

	@Id
	private String id;
	
	@Field
	private String fDescription;
	
	@Field
	private Event event;
	
	@Field
	private User user;
	
	@Field
	private LocalDateTime createdOn;
	
	@Field
	private boolean isActive;
}
