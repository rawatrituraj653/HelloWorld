package com.nit.beans;

public class PrivateMethodClass {
 
	  private String sayHello(String name)
	  {
		   System.out.println("private method sayHello got called");
		   return   "Hello " + name;
	  }
}
