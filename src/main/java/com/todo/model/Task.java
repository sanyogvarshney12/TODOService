package com.todo.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * 
 * @author Sanyog Varshney
 * @version 1.0.0
 * @category Task Entity
 * @created 2021/07/14
 *
 */

@Data
@Document(collection = "tasks")
public class Task {
	
	@Id
	private String id;
	private String title;
	private String category;
	private String status;
	private String description;
	private String userName;
	@CreatedDate
	private LocalDateTime createdOn;
	@LastModifiedDate
	private LocalDateTime modifiedOn;
}
