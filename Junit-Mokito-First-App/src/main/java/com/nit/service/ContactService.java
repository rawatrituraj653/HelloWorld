package com.nit.service;

import com.nit.beans.Contact;
import com.nit.dao.ContactDao;
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
