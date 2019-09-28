package com.asif;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jExample {

	 private final static Logger logger = Logger.getLogger(Log4jExample.class);
	 
	 
	  public static void main(String[] args) {
		
		   PropertyConfigurator.configure("log4j.properties");	  
		   
		   
		   logger.debug("this is my simple debug method");
		   logger.info("this is my simple info method ");
		   logger.warn("this is my simple warn method ");
		   logger.error("this is simple error method ");
		   logger.fatal("this is simple fatal method ");
	}
}
