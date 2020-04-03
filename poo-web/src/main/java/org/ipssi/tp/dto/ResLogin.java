package org.ipssi.tp.dto;

public class ResLogin {
	private String message;
	private String token=null;
	//...
	
	
	public ResLogin(String message, String token) {
		super();
		this.message = message;
		this.token = token;
	}
	
	public ResLogin() {
		super();
	}

	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
}
