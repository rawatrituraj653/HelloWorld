package com.asif.array;

public class Question8 {

	  public static void main(String[] args) {
		
		   int array [] = {4,5,6};
		   
		   int n= array.length;
		   compute(array , n);
	}
	  
	  public static void compute(int array[] ,int n)
	  {
		    int temp [] = new int[n];
		    int sum =0;
		    for(int i=0; i<n; i++)
		    {
		    	for(int j=0 ; j<n;j++)
		    	{
		    		sum= sum+array[j];
		    	}
		    	
		    	temp[i] = sum-array[i];
		    	sum=0;
		    }
		    
		    for(int k =0; k<temp.length; k++)
		    {
		    	System.out.print(temp[k] + " ");
		    }
	  }
}
