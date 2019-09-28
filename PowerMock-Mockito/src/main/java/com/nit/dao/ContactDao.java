package com.nit.dao;

import com.nit.model.Contact;

public interface ContactDao {

	public Contact findByName(String name);
	 
}
