package com.nit.asif;

public class ThirdLargestNumber {
    
	      public static void main(String[] args) {

	    	  int[] numbers = {6,8,1,9,2,1,10};
	    	  
	    	  int n = numbers.length;
	    	  
	    	  for(int i = 0 ; i<n-1; i++)
	    	  {
	    		  for(int j = 0 ; j<n-i-1 ; j++)
	    		  {
	    			   if(numbers[j]<numbers[j+1])
	    			   {
	    				   int temp = numbers[j];
	    				   numbers[j]=numbers[j+1];
	    				   numbers[j+1] = temp;
	    				   
	    			   }
	    		  }
	    	  }
	    	  
	    	  System.out.println("third largest element is : "  + numbers[2]);
	    	  System.out.println("-------------------");
	    	  
	    	  for(int  i =0; i<numbers.length; i++)
	    	  {
	    		  System.out.println(numbers[i]);
	    	  }
	    	  
	    	  
	    	  	      }
}
