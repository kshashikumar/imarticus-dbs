package com.example.demo.exception;

import java.util.Date;

public class ExceptionDetails {
  
	String message;
	String details;
	Date timestamp;
	public ExceptionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ExceptionDetails(String message, String details, Date timestamp) {
		super();
		this.message = message;
		this.details = details;
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	@Override
	public String toString() {
		return "ExceptionDetails [message=" + message + ", details=" + details + ", timestamp=" + timestamp + "]";
	}
	
	
}
