package com.nit.service;

public class WeatherService {

	 private IBMWeatherForcator ibmWeatherForcator;
	 
	 public void setIBMWeatherForeCastor(IBMWeatherForcator ibmWeatherForcator)
	 {
		 System.out.println(ibmWeatherForcator.getClass().getName());
		 System.out.println("setter injection got called");
		  this.ibmWeatherForcator=ibmWeatherForcator;
	 }
	
	 public Double getTemparature(long zipcode)
	 {
		 System.out.println("getTemperature()  called");
		 Double temparature= ibmWeatherForcator.findTemperature(zipcode);
		 System.out.println("Temparature from Mock "+ temparature);
		 return temparature;
		 
		 
	 }
	  
}
