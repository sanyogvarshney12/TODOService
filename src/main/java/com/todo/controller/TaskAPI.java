package com.todo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.todo.dto.ErrorResponse;
import com.todo.dto.TaskDTO;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Tasks", description = "TODO App Task APIs")
public interface TaskAPI {

	@Operation(summary = "Create a new Task", description = "Create a new Task for current user", tags = {"tasks"})
	@ApiResponses(
			value = {
					@ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = TaskDTO.class))),
					@ApiResponse(responseCode = "400", description = "Invalid Data in Request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
					@ApiResponse(responseCode = "500", description = "Server Error Occured. Contact System Administrator", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
			}
			)
	public ResponseEntity<TaskDTO> createTask(TaskDTO taskDto);
	
	@Operation(summary = "Search All Tasks", description = "Search tasks associated with current user", tags = {"tasks"})
	@ApiResponses(
			value = {
					@ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = TaskDTO.class))),
					@ApiResponse(responseCode = "400", description = "Invalid Data in request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
					@ApiResponse(responseCode = "500", description = "Server Error Occured. Contact System Administrator", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
			}
			)
	public ResponseEntity<List<TaskDTO>> findTasksByUserName(String userName);
	
	@Operation(summary = "Search Task", description = "Search a particular task by Id", tags = {"tasks"})
	@ApiResponses(
			value = {
					@ApiResponse(responseCode = "200", description = "Success", content = @Content(schema = @Schema(implementation = TaskDTO.class))),
					@ApiResponse(responseCode = "400", description = "Invalid Data in request", content = @Content(schema = @Schema(implementation = ErrorResponse.class))),
					@ApiResponse(responseCode = "500", description = "Server Error Occured. Contact System Administrator", content = @Content(schema = @Schema(implementation = ErrorResponse.class)))
			}
			)
	public ResponseEntity<TaskDTO> findTaskById(String id);
}
