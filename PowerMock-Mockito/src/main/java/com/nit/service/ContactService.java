package com.nit.service;

import com.nit.dao.ContactDao;
import com.nit.model.Contact;

public class ContactService {
 
	  public ContactDao dao;
	  
	  public void setDao(ContactDao dao)
	  {
		  this.dao=dao;
	  }
	  
	  
	  public Contact getByName(String name)
	  {
		  System.out.println("getByName method called");
		  Contact c = dao.findByName(name);
		  return c;
	  }
	  
	  public static String printMessage1(String message)
	  {
		  System.out.println("static method called");
		  return message;
	  }
	  
	  
	  private String printMessage2(String message)
	  {
		  System.out.println("private method called");
		  return message;
	  }
}
