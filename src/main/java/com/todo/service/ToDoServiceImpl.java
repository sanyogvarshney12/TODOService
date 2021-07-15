package com.todo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.todo.dao.TaskRepository;
import com.todo.dto.TaskDTO;
import com.todo.exception.ToDoApplicationException;
import com.todo.functions.TransformerFunction;

@Service
public class ToDoServiceImpl implements IToDoService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ToDoServiceImpl.class);
	
	@Autowired
	private TaskRepository repository;
	
	@Override
	public ResponseEntity<TaskDTO> createTask(TaskDTO dto) {
		if(LOGGER.isInfoEnabled()) {
			LOGGER.info("Inside ToDoServiceImpl class, createTask()");
		}
		TaskDTO dto1 = TransformerFunction.toTaskDto(repository.save(TransformerFunction.toTask(dto)));
		return new ResponseEntity<>(dto1, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<TaskDTO>> findByUserName(String userName) {
		if(LOGGER.isInfoEnabled()) {
			LOGGER.info("Inside ToDoServiceImpl class, findByUserName()");
		}
		List<TaskDTO> list = repository.findByUserName(userName).stream()
				.map(TransformerFunction::toTaskDto).collect(Collectors.toList());
		return new ResponseEntity<>(list, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<TaskDTO> findTaskById(String id) {
		if(LOGGER.isInfoEnabled()) {
			LOGGER.info("Inside ToDoServiceImpl class, findTaskById()");
		}
		TaskDTO dto = TransformerFunction.toTaskDto(repository.findById(id).orElseThrow(()->new ToDoApplicationException("No Task with this ID found.", id)));
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	

}
