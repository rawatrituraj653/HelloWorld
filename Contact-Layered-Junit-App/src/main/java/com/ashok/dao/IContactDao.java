package com.ashok.dao;

import com.ashok.model.Contact;

public interface IContactDao {

	public boolean save(Contact contact);

	public Contact findByName(String name);
}
