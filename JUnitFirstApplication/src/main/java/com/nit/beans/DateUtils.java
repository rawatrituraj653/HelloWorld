package com.nit.beans;

public class DateUtils {

	  private static DateUtils instance = null;
	  
	  private DateUtils()
	  {
		  
	  }
	  
	  
	  public static  DateUtils getInstance()
	  {
		     if(instance==null)
		     {
		    	    return instance;
		     }
		     return new DateUtils();
	  }
}
