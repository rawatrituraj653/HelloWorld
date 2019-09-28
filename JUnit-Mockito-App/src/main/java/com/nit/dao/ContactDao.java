package com.nit.dao;

import com.nit.model.Contact;

public class ContactDao {

	public Contact findByName(String name) {
		Contact c = new Contact("Raju", 97979799L);
		return c;
	}
}
