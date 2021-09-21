package com.dbs.practice1.log;

public class Logging {

	public void beforeAdvice() {
		System.out.println("Before setting up values to Employee");
	}
	
	public void afterAdvice() {
		System.out.println("After setting up values to Employee");
	}
	
	public void afterReturningAdvice(Object val) {
		System.out.println("Returned value is "+val);
	}
}
