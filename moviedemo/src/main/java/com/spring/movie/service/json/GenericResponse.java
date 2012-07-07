package com.spring.movie.service.json;

import java.util.ArrayList;
import java.util.List;

public class GenericResponse {

	private Boolean success;
	private List<String> message;
	
	public GenericResponse(){
		message = new ArrayList<String>();
	}
	
	public Boolean getSuccess() {
		return success;
	}
	
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	public List<String> getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message.add(message);
	}
	
}
