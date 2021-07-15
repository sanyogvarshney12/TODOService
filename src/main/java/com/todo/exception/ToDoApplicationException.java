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

	private String logRef;
	
	public ToDoApplicationException(String msg, String logRef) {
		super(msg);
		this.logRef = logRef;
	}
	
	public String getLogRef() {
		return this.logRef;
	}

}
