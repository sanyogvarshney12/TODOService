package com.todo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.todo.dto.TaskDTO;

/**
 * 
 * @author Sanyog Varshney
 * @version 1.0.0
 * @category Controller Interface Implementation
 * @created 2021/07/14
 *
 */
@RestController
public class ToDoControllerImpl implements IToDoController {

	@Override
	public ResponseEntity<TaskDTO> createTask(TaskDTO taskDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<TaskDTO>> findTasksByUserName(String userName) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ResponseEntity<TaskDTO> findTaskById(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
