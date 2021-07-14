package com.todo.exception;

/**
 * 
 * @author Sanyog Varshney
 * @version 1.0.0
 * @category Custom Application Exception
 * @created 2021/07/14
 *
 */
public class ToDoApplicationException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ToDoApplicationException(String msg) {
		super(msg);
	}

}
