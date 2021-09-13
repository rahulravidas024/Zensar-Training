package com.demo.exception;

public class InvalidEmailException extends RuntimeException {
	String errMsg;

	public InvalidEmailException() {

	}

	public InvalidEmailException(String err) {
		errMsg = err;
	}

	public void showError() {
		System.out.println(errMsg);
	}

}
