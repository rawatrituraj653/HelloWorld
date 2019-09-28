package com.nit.beans;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainClass {

	  public static void main(String[] args) {
		
		  //Running unit test cases class
		   
		  Result result = JUnitCore.runClasses(CalculatorTest.class, DateUtilsTest.class,PrivateMethodClassTest.class);
		  //geting total count of test cases ran 
		  int totalCount = result.getRunCount();
		  //getting total failure count 
		  int failureCount = result.getFailureCount();
		  System.out.println("Failure count : " + failureCount);
		  //getting the reason of failure 
		  List<Failure> failures = result.getFailures();
		  
		  for(Failure f: failures)
		  {
			  System.out.println(f.getMessage());
		  }
		  
		  //generate excel sheet over here
	}
}
