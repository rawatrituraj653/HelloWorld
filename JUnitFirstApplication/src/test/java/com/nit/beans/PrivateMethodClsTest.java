package com.nit.beans;

import static org.junit.Assert.assertNotNull;

import java.lang.reflect.Method;

import org.junit.Test;

public class PrivateMethodClsTest {

	     @Test(timeout = 1000)
	public void private_method_test()
	{
		  String actuall = null;
		   try
		   {
			   Class cls = Class.forName("com.nit.beans.PrivateMethodCls");
			   
			   Object object = cls.newInstance();
			   
			   Method method= cls.getDeclaredMethod("sayHi", String.class);
			   //invoking the method
			    method.setAccessible(true);
			   Object obj= method.invoke(object, "asif");
			   actuall= (String)obj;
			   System.out.println("Actaul Is:: " + actuall);
				   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		   
		   
		   assertNotNull(actuall);
	}
}
