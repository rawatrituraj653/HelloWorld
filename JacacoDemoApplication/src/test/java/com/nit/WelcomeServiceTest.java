package com.nit;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
public class WelcomeServiceTest {
	     @Test
	     
	   public void testWelcome1()
	   {
		     WelcomeService ws= new WelcomeService();
		    String msg=  ws.welcome("M");
		    assertNotNull(msg);
	   }
	
	 @Test 
	 
	 public void testWelcome() {
		 WelcomeService wservice= new WelcomeService();
		 String msg = wservice.welcome("F");
		 assertNotNull(msg);
	 }
}
