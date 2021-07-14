package com.todo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.todo.dto.TaskDTO;
import com.todo.service.IToDoService;
import com.todo.service.ToDoServiceImpl;

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

	private static final Logger LOGGER = LoggerFactory.getLogger(ToDoControllerImpl.class);
	
	@Autowired
	private IToDoService service;
	
	@Override
	public ResponseEntity<TaskDTO> createTask(TaskDTO taskDto) {
		if(LOGGER.isInfoEnabled()) {
			LOGGER.info("Inside ToDoControllerImpl class, createTask()");
		}
		return service.createTask(taskDto);
	}

	@Override
	public ResponseEntity<List<TaskDTO>> findTasksByUserName(String userName) {
		if(LOGGER.isInfoEnabled()) {
			LOGGER.info("Inside ToDoControllerImpl class, findTasksByUserName() :: userName : {}", userName);
		}
		return service.findByUserName(userName);
	}
	
	@Override
	public ResponseEntity<TaskDTO> findTaskById(String id) {
		if(LOGGER.isInfoEnabled()) {
			LOGGER.info("Inside ToDoControllerImpl class, findTasksByUserName() :: ID : {}", id);
		}
		return service.findTaskById(id);
	}
	

}
