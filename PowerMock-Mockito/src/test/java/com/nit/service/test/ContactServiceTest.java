package com.nit.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.nit.dao.ContactDao;
import com.nit.model.Contact;
import com.nit.service.ContactService;

@RunWith(PowerMockRunner.class)
@PrepareForTest(fullyQualifiedNames = "com.nit.*")
public class ContactServiceTest {

	  // @Test
	@Ignore
	  public void test_findByName()
	  {
		  ContactDao dao= PowerMockito.mock(ContactDao.class);
		  PowerMockito.when(dao.findByName("asif"))
		                            .thenReturn(new Contact("asif", 1234l));
		  ContactService service  = new ContactService();
		  service.setDao(dao);
		  Contact c = service.getByName("asif");
		  System.out.println(c);
		  assertNotNull(c);
	  }
	
	
	@Test
	public void test_printMesage_staticMethod()
	{
		String input ="hello powermock";
		String  expectation = "hello powermock";
		PowerMockito.mockStatic(ContactService.class);
		PowerMockito.when(ContactService.printMessage1(input)).thenReturn(expectation);
		
		String actual = ContactService.printMessage1(input);
		assertEquals(expectation, actual);
		
		
		
		
	}
	
}
