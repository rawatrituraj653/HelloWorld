package com.nit.dao;

import com.nit.bean.Contact;

public interface IContactDao {

	   public boolean save(Contact contact);
	   
	   public Contact findByName(String name);
}
