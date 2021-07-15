package com.todo.exception;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import com.todo.dto.ErrorResponse;

@ControllerAdvice
public class ApplicationExceptionHandler {
	
	private ResponseEntity<ErrorResponse> error(ServletWebRequest request, final Exception e, HttpStatus status, String logRef) {
		String message = Optional.of(e.getMessage()).orElse(e.getClass().getSimpleName());
		var error = ErrorResponse.builder().path(request.getRequest().getRequestURI())
								.timestamp(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")))
								.httpStatusCode(status.value())
								.httpStatusName(status.name())
								.message(message)
								.logRef(logRef)
								.build();
		return new ResponseEntity<>(error, status);
	}
	
	@ExceptionHandler(ToDoApplicationException.class)
	public ResponseEntity<ErrorResponse> toDoApplicationExceptionHandler(WebRequest request, final ToDoApplicationException e) {
		return error((ServletWebRequest)request, e, HttpStatus.BAD_REQUEST, e.getLogRef());
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> otherExceptionHandler(WebRequest request, final Exception e) {
		return error((ServletWebRequest)request, e, HttpStatus.INTERNAL_SERVER_ERROR, "");
	}

}
