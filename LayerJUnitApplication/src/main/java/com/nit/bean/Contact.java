package com.nit.bean;

public class Contact {
  
	  private String contactName;
	  private Long  contactNum;
	public Contact() {
		super();
	}
	public Contact(String contactName, Long contactNum) {
		super();
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
