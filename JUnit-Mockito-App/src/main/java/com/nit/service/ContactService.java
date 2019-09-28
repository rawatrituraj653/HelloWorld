package com.nit.service;

import com.nit.dao.ContactDao;
import com.nit.model.Contact;

public class ContactService {

	public ContactDao dao;

	public void setDao(ContactDao dao) {
		this.dao = dao;
	}

	public Contact getByName(String name) {
		System.out.println("getByName() called");
		Contact c = dao.findByName(name);
		return c;
	}

}
