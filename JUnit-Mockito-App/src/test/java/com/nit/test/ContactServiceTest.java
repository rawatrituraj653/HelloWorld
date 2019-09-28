package com.nit.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.nit.dao.ContactDao;
import com.nit.model.Contact;
import com.nit.service.ContactService;

@RunWith(MockitoJUnitRunner.class)
public class ContactServiceTest {

	@Mock
	private ContactDao dao;

	@InjectMocks
	private ContactService service;

	@Test
	public void testget() {
		service.setDao(dao);
		Contact c = service.getByName("Raju");
		System.out.println(c);
		assertNotNull(c);
	}
}