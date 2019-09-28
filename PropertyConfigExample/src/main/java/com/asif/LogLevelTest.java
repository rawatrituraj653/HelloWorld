package com.asif;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LogLevelTest {

	  static final Logger logger = Logger.getLogger(LogLevelTest.class);
	  public static void main(String[] args) {
		  PropertyConfigurator.configure("log4j.properties");
		  logger.debug("this is debug message");
		  logger.info("this is info message");
		  logger.warn("this is simple warn message");
		  logger.error("this is simple error message");
		  logger.fatal("this is simple fatal message");
		  
	}
}
