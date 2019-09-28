package com.nit.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class CalculatorTest {
  
	 private static Calculator  calc = null;
	 
	 @BeforeClass
	 public static void m1()
	 { 
		   calc= new Calculator();
	 }
	 
         @Test	 
	 public void add_test()
	 {
	   int actual	=  calc.add(10, 20);
	   assertEquals(30, actual);
	 }
	              
               @Test
             public void div_test()
            {
            	  int actual = calc.div(10, 5);
            	   assertNotEquals(5, actual);
            }
               
                @Test
               public void div_test_true()
               {
            	     int actual = calc.div(20, 2);
            	     assertEquals(10, actual);
               }
                
                 @Test(expected = ArithmeticException.class)
                public void divTest()
                {
                	  calc.div(10, 0);
                }
               
                  @Test(timeout = 2000)
               //  @Ignore
	          public void email_Test()
	          {
	        	   calc.sendEmail();
	          }
                 
           @AfterClass
         public static void m2()
         {
        	  calc= null;
         }
}
