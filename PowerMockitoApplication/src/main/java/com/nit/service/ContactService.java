package com.nit.service;

import com.nit.dao.ContactDao;
import com.nit.model.Contact;

public class ContactService {
 
	  public ContactDao dao;

	public ContactDao getDao() {
		return dao;
	}

	public void setDao(ContactDao dao) {
		this.dao = dao;
	}
	  
	  public Contact getByName(String name)
	  {
		  
		  System.out.println("getByName() method callec");
		  Contact contact = dao.findByName(name);
		  return contact;
	  }
	
	  
	  
	  public static String printMessage1(String message)
	  {
		   System.out.println("printMessage1() method got executed");
		   return  message;
	  }
	  
	  private String printMessage2(String message)
	  {
		  System.out.println("printMessage2() method got executed");
		  return message;
	  }
}
