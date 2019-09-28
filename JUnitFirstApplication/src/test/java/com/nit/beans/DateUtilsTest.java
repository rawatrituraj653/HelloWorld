package com.nit.beans;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DateUtilsTest {
                   
	             @Test
	          public void singletonObjectTest()
	          {
	        	        DateUtils object1= DateUtils.getInstance();
	        	        DateUtils object2 = DateUtils.getInstance();
	        	        assertEquals(object1, object2);
	          }
}
