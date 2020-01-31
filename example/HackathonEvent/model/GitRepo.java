package com.example.HackathonEvent.model;

import java.time.LocalDateTime;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
@Document
@Data
public class GitRepo {

	@Id	
	private String id;
	
	@DBRef
	@Field
	private String eventId;
	
	@DBRef
	@Field
	private String teamId;
	
	@Field
	private String cloneUrl;
	
	@Field
	private String sshUrl;
	
	@Field
	private String repoName;
	
	@Field
	private LocalDateTime createdOn;
	
	@Field
	private boolean isActive;
}
