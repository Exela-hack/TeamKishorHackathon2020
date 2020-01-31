package com.example.HackathonEvent.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document
public class Event {
	@Id
	private String id;
	
	//organization Id
	@Field
	private User userId;
	
	@Field
	private String eventTitle;
	
	@Field
	private String minSize;
	
	@Field
	private String maxSize;
	
	@Field
	private LocalDateTime startDate;
	
	@Field
	private LocalDateTime endDate;
			
    @Field
	private LocalDateTime createdOn;
    
    @Field
    private LocalDateTime regLastDate;
    
    @Field
    private String imagePath;
    
    @Field
    private String rules;
    
    @Field
    private String description;
    
    @Field
	private boolean isActive;
    
    @Field
    private List<Team> team;
    
    @Field
    private List<Prize> prize;
    
    @Field
    private String problemStatement;

	
}
