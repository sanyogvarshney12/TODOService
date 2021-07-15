package com.todo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
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

	@Schema(description = "Request where the exception occured")
	private String path;
	@Schema(description = "Reference Data which is not found, due to which exception occured")
	private String logRef;
	@Schema(example = "400", description = "HttpStatus Code")
	private int httpStatusCode;
	@Schema(example = "BAD_REQUEST", description = "HttpStatus Name")
	private String httpStatusName;
	private String message;
	private String timestamp;
}
