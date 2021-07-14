package com.todo.dto;

import java.time.LocalDateTime;

import org.apache.http.HttpStatus;

import lombok.Builder;
import lombok.Data;

/**
 * 
 * @author Sanyog Varshney
 * @version 1.0.0
 * @category Error Response Builder
 * @created 2021/07/14
 *
 */
@Data
@Builder
public class ErrorResponse {

	private String path;
	private HttpStatus httpStatus;
	private String message;
	private LocalDateTime timestamp;
}
