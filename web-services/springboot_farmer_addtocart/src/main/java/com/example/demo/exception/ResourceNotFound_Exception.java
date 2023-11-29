package com.example.demo.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFound_Exception extends RuntimeException {

	private static final long serialVersionUID=1L;
	public ResourceNotFound_Exception(String message) {
		super(message);
	}
}
