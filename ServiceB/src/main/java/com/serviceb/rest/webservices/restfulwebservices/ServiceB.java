package com.serviceb.rest.webservices.restfulwebservices;

public class ServiceB {

	private String message;

	public ServiceB(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return String.format("WhatsupBean [message=%s]", message);
	}

}
