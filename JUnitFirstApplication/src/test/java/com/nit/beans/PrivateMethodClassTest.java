package com.nit.beans;

import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Method;

import org.junit.Test;

public class PrivateMethodClassTest {

	       @Test
	     public void test_sayHello()
	     {
	    	  String actual =null;
	    	  try {
	    	 //loading the class
	    Class cls= Class.forName("com.nit.beans.PrivateMethodClass");
	    //instanciating the object
	    Object obj= cls.newInstance();
	    //loading the method 
	    Method method= cls.getDeclaredMethod("sayHello", String.class);
	    //method method accessibel from outside 
	    method.setAccessible(true);
	    //invoking method
	    Object returnObject = method.invoke(obj, "asif");
	    actual= (String) returnObject;
	    System.out.println("Actual :: "+ actual); ;
	    		
	    
	    		  
	    		  
	    	  }
	    	  catch(Exception ex)
	    	  {
	    		  ex.printStackTrace();
	    	  }
	    	  
	    	  assertNotNull(actual);
	     }
}
