package com.nit.service;

  
 /*
  * This interface for defining the method to get temperature
  */

public interface IBMWeatherForcator {

	 /*
	  * method to determine temperature as per zipcode
	  */
	
	 public  Double findTemperature(long zipcode);
} 
