package com.asif.array;

public class Q1 {
 
	      public static void main(String[] args) {
			
	    	    int  array [] = {1,2,3,4,5,6,7};
	    	    leftRotate(array , 2,7);
	    	    printArray(array, 7);
		}
	      
	      public static void leftRotate(int array[] , int p, int n)
	      {
	    	  for(int i =0 ; i<p; i++)
	    	  {
	    		  leftRotatedByOne(array , n);
	    	  }
	      }
	      
	      public static void   leftRotatedByOne(int array[] , int n)
	      {
	    	  int temp, i;
	    	  temp =array[0];
	    	  
	    	  for(i=0;i<n-1;i++)
	    	  {
	    		  array[i] =array[i+1];
	    	  }
	    	  
	    	  array[i]=temp;
	      }
	      
	      public static	void printArray(int arr[], int n) 
	  	{ 
	  		for (int i = 0; i < n; i++) 
	  			System.out.print(arr[i] + " "); 
	  	} 

	      
	      
}
