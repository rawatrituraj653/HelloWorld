package com.asif;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class StockMarket {

	     static Logger logger= Logger.getLogger(StockMarket.class);
	     
	     public double getStockPrice(String companyName) throws Exception
	     {
	    	 
	    	 BasicConfigurator.configure();
	    	   logger.debug("getStockMarket() method started" );
	    	   double price = 0.0;
	    	   if(companyName.equals("IBM"))
	    	   {
	    		   price=450.0;
	    	   }
	    	   else if(companyName.equals("TCS"))
	    	   {
	    		   price= 901.0;
	    	   }
	    	   else  if(companyName.equals("Amazon"))
	    	   {
	    		    price= 800.0;
	    	   }
	    	   else
	    	   {
	    		   throw new Exception("company not found");
	    	   }
	    	   logger.debug("getSckotMarket() mrethod ended");
	    	   return price;
	     }
}
