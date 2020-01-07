package com.cimc.senheyun.exception;

public class MyStatus 
{
	private String state;
	private String errorCode;
	private String errorMessage;
	
	public MyStatus()
	{
		
	}
	
	public MyStatus(String state, String errorCode, String errorMessage)
	{
		this.state = state;
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
}
