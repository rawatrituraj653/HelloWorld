package com.ashok.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.ashok.dao.IContactDao;
import com.ashok.model.Contact;
import com.ashok.service.ContactService;

@RunWith(MockitoJUnitRunner.class)
public class ContactServiceTest {

	private static ContactService service = null;

	private static Contact c = new Contact("ashok", 1234l);

	@BeforeClass
	public static void b4() {

		service = new ContactService();

		IContactDao dao = mock(IContactDao.class);

		when(dao.save(c)).thenReturn(true);
		when(dao.findByName("Raju")).thenReturn(new Contact("raju", 1111l));
		when(dao.findByName("Ashok")).thenReturn(new Contact("Ashok", 2222l));

		service.setDao(dao);
	}

	@Test
	public void test_saveContact() {
		boolean actual = service.saveContact(c);
		assertTrue(actual);
	}

	@Test
	public void test_findContact() {
		Contact c = service.getContactByName("ashok");
		System.out.println(c);
		assertNotNull(c);
	}

	@AfterClass
	public static void afterClass() {
		service = null;
	}
}
