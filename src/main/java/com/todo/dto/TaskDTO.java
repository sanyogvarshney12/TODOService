package com.todo.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 
 * @author Sanyog Varshney
 * @version 1.0.0
 * @category Task Response DTO
 * @created 2021/07/14
 *
 */

@Data
public class TaskDTO {

	@Schema(example = "Order Pizza", description = "This is the Title of the task", required = true)
	@NotNull(message = "{taskDto.title.null}")
	private String title;
	@Schema(example = "Food", description = "Category in which task can be tagged", required = false)
	private String category;
	@Schema(example = "In progress/completed", description = "task progress", required = false)
	private String status;
	@Schema(description = "Desctiption of the task", required = true)
	@NotNull(message = "{taskDto.description.null}")
	private String description;
	@Schema(example = "yyyy-MM-ddTHH:mm:ss", description = "Task Creation Time", required = false)
	private LocalDateTime createdOn;
	@Schema(example = "yyyy-MM-ddTHH:mm:ss", description = "Task Updation Time", required = false)
	private LocalDateTime modifiedOn;
	@Schema(example = "Sanyog Varshney", description = "User who created task", required = true)
	private String userName;
	
}
