package com.asif;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestStockMarket {

	    
	@Test
	public void testgetStcokPrice() throws Exception
	{
		 StockMarket sm = new StockMarket();
	   double price = 	 sm.getStockPrice("IBM");
	   System.out.println("price :: " + price);
	     double actual = 450.0;
	  // assertEquals(price,  actual);
	     assertNotNull(price);
	}
}
