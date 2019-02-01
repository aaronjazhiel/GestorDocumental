package com.mx.bancomer.biva.application.exception;

public class BivaException extends Exception{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Throwable frontend;
	private String backen;
	
	public BivaException() {
		super();
	this.backen=super.getMessage();
	this.frontend=super.getCause();
	}
	
	public BivaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public BivaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	public BivaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	public Throwable getFrontend() {
		return frontend;
	}
	public void setFrontend(Throwable frontend) {
		this.frontend = frontend;
	}
	public String getBacken() {
		return backen;
	}
	public void setBacken(String backen) {
		this.backen = backen;
	}
	
	
	
}
