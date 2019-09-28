package com.nit;

public class WelcomeService {

	   public String welcome(String gender)
	   {
		     String msg= null;
		     if(gender.equals("M"))
		     {
		    	 msg= "Hello Sir ... !!";
		     }
		     else
		     {
		    	 msg="Hello Madam ... !!";
		     }
		     
		     return msg;
	   }
}
