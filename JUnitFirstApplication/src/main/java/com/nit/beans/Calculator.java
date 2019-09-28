package com.nit.beans;

public class Calculator {

	  public Integer add(int a, int  b)
	  {
		  return a+b;
	  }
	  
	  
	  public Integer div(int a, int b)
	  {
		  return a/b;
	  }
	  
	  
	  public void sendEmail()
	  {
		     try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	  }
}
