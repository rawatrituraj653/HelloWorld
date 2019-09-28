package com.ashok.model;

public class Contact {

	private String contactName;
	private Long contactNum;

	public Contact() {
	}

	public Contact(String contactName, Long contactNum) {
		this.contactName = contactName;
		this.contactNum = contactNum;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Long getContactNum() {
		return contactNum;
	}

	public void setContactNum(Long contactNum) {
		this.contactNum = contactNum;
	}

	@Override
	public String toString() {
		return "Contact [contactName=" + contactName + ", contactNum=" + contactNum + "]";
	}

}
