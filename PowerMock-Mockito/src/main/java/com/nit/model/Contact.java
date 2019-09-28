package com.nit.model;

public class Contact {

	private String name;
	private Long number;
	public Contact() {
		super();
	}
	public Contact(String name, Long number) {
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getNumber() {
		return number;
	}
	public void setNumber(Long number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + "]";
	}
	
	
	 
}
