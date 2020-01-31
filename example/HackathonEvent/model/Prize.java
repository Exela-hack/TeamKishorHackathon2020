package com.example.HackathonEvent.model;

import java.time.LocalDateTime;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document
@Data
public class Prize {
	
	@Id
	@Field(value="_id")
	private String id;
	
	@Field(value="amount")
	private String amount;
	
	@Field(value="winnerLevel")
	private String winnerLevel;
		
	@Field(value="createdOn")
	private LocalDateTime createdOn;
	
	@Field(value="isActive")
	private boolean isActive;

}
