package com.spring.movie.domain;

import java.io.Serializable;

public class BNActor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7056336878869146190L;
	private Integer value;
	private String label;
	
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	
	@Override
	public String toString() {
		return "BNActor [value=" + value + ", label=" + label + "]";
	}	
	
}