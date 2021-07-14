package com.todo.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.dto.TaskDTO;

/**
 * 
 * @author Sanyog Varshney
 * @version 1.0.0
 * @category Controller Interface
 * @created 2021/07/14
 *
 */
@RequestMapping("/api/v1")
public interface IToDoController extends TaskAPI{

	@PostMapping(path = "/task", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TaskDTO> createTask(@RequestBody TaskDTO taskDto);
	
	@GetMapping(path = "/task", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<TaskDTO>> findTasksByUserName(@RequestParam("username") String userName);
	
	@GetMapping(path = "/task/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<TaskDTO> findTaskById(@PathVariable String id);
}
