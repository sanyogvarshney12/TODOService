package com.todo.functions;

import java.time.format.DateTimeFormatter;

import com.todo.dto.TaskDTO;
import com.todo.model.Task;

public class TransformerFunction {

	public static Task toTask(TaskDTO taskDto) {
		var task = new Task();
		task.setUserName(taskDto.getUserName());
		task.setCategory(taskDto.getCategory());
		task.setDescription(taskDto.getDescription());
		task.setStatus(taskDto.getStatus());
		task.setTitle(taskDto.getTitle());
		return task;
	}
	
	public static TaskDTO toTaskDto(Task task) {
		var dto = new TaskDTO();
		String createdDate = task.getCreatedOn().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
		String modifiedDate = task.getModifiedOn().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
		dto.setUserName(task.getUserName());
		dto.setCategory(task.getCategory());
		dto.setDescription(task.getDescription());
		dto.setStatus(task.getStatus());
		dto.setTitle(task.getTitle());
		dto.setCreatedOn(createdDate);
		dto.setModifiedOn(modifiedDate);
		return dto;
	}
}
