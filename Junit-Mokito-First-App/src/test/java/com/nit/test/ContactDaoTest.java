package com.nit.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.nit.beans.Contact;
import com.nit.dao.ContactDao;

@RunWith(MockitoJUnitRunner.class)
public class ContactDaoTest {

	         @InjectMocks
	      private ContactDao dao;
	          
	         @Test
	         public void test_findByName()
	          {
	        	 Contact c = dao.findByName("Raju");
	        	 System.out.println(c);
	        	 
	        	 assertNotNull(c);
	         }
	         
}
