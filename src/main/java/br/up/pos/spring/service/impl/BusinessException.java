package br.up.pos.spring.service.impl;

@SuppressWarnings("serial")
public class BusinessException extends Exception {
	
	public BusinessException(String code) {
		super(code);
		this.code = code;
	}

	public BusinessException(String code, String message) {
		super(message);
		this.code 		= code;
		this.message 	= message;
	}
	
	private String code;
	private String message;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
