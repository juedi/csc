package com.quzzjy.csc.exception;

public class ServiceException extends RuntimeException {

	private static final long serialVersionUID = 8025703913692762598L;

	public ServiceException(String message) {
		super(message);
	}
	
	public static ServiceException create(String message) {
		return new ServiceException(message);
	}
	
}
