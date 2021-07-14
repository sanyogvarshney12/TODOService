package com.todo.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.todo.dto.TaskDTO;

/**
 * 
 * @author Sanyog Varshney
 * @version 1.0.0
 * @category Service Interface
 * @created 2021/07/14
 *
 */
public interface IToDoService {

	ResponseEntity<TaskDTO> createTask(TaskDTO dto);
	
	ResponseEntity<List<TaskDTO>> findByUserName(String userName);
	
	ResponseEntity<TaskDTO> findTaskById(String id);
	
}
