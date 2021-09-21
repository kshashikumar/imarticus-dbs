package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public ResponseEntity<Object> resourceNotFound(EmployeeNotFoundException ex,WebRequest req){
		ExceptionDetails exd=new ExceptionDetails(ex.getMessage(),req.getDescription(false),new Date());
		return new ResponseEntity<Object>(exd, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	public ResponseEntity<Object> otherException(EmployeeNotFoundException ex,WebRequest req){
		ExceptionDetails exd=new ExceptionDetails(ex.getMessage(),req.getDescription(false),new Date());
		return new ResponseEntity<Object>(exd, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
