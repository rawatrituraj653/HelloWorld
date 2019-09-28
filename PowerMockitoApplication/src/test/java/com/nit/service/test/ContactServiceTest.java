package com.nit.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
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
@PrepareForTest(fullyQualifiedNames = "com.nit.service.*")
public class ContactServiceTest {

	
     //	     @Test
	@Ignore
	     public void test_findByName()
	     {
	    	  ContactDao dao= PowerMockito.mock(ContactDao.class);
	    	  PowerMockito.when(dao.findByName("asif")).thenReturn(new Contact ("asif", 12345l));
	    	  
	    	  ContactService service = new ContactService();
	    	  service.setDao(dao);
	    	   
	    	   Contact c=  service.getByName("asif");
	    	   System.out.println(c);
	    	   assertNotNull(c);
	     }
	     
	     
	      //@Test
	       @Ignore
	       
	     public void test_privateMethod_printMessage2()  throws Exception
	     {
	    	
	    	 ContactService  mock=  PowerMockito.spy(new ContactService());
	    	 
	    	 
	    	 String actual = (String) org.powermock.reflect.Whitebox.invokeMethod(mock, "printMessage2", "Hi");
	    	 assertEquals("Hi", actual);
	    	    
	     }
	     
	     @Test
	   	public void test_printMessage_staticMethod() {

	   		String input = "Hello PowerMockito"; // 1
	   		String expectation = "Hello PowerMockito"; // 2

	   		PowerMockito.mockStatic(ContactService.class); // 3

	   		PowerMockito.when(ContactService.printMessage1(input)).thenReturn(expectation); // 4

	   		String actual = ContactService.printMessage1(input); // 5
	   		Assert.assertEquals(expectation, actual); // 6
	   	}
}
