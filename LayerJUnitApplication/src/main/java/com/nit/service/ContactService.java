package com.nit.service;

import com.nit.bean.Contact;
import com.nit.dao.IContactDao;

public class ContactService {

	    private IContactDao dao;

		public IContactDao getDao() {
			return dao;
		}

		public void setDao(IContactDao dao) {
			this.dao = dao;
		}
	    
	    public boolean saveContact(Contact c)
	    {
	         return dao.save(c);
	    }
	    
	    public Contact getContactByName(String name)
	    {
	    	return dao.findByName(name);
	    }
}
