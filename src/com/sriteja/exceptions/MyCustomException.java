package com.sriteja.exceptions;

public class MyCustomException extends RuntimeException{

	public MyCustomException() {
		super("Dear user we don't have any Company name for this employee id = 101");
	}
}
