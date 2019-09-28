package com.nit.dao;

import com.nit.beans.Contact;

public class ContactDao {

	      public Contact findByName(String name)
	      {
                 Contact  c= new Contact("asif", 926286l);
                 return c;
                 
	      }
}
