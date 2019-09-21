package com.nit.asif;

public class MaxDifference {

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

		 for(int i = 0 ; i<numbers.length; i++)
		 {
			 System.out.println(numbers[i]);
		 }
		
		 
		 
		 int max_difference = numbers[0]- numbers[n-1];
		 System.out.println("maximum differece is : " + max_difference);
	}
	
	
}
