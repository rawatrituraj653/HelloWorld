package com.asif.array;

import java.util.Arrays;

public class Question2 {

	  public static void main(String[] args) {
		
		   int array[] = {1,2,3,4,5};
		   
		  rightRotate(array , 2);
	}
	  
	  public static void rightRotate(int []array , int p)
	  {
		  int temp;//to store last two element 
		 //concept to rotate the array by two position rigth 
		  for(int i=1; i<=p; i++)
		  {
			      temp= array[array.length-1];
			      for(int j=array.length-1; j>0 ;j--)
			      {
			    	  array[j]=array[j-1];
			      }
			      array[0] = temp;
		  }
		  
		  System.out.println(Arrays.toString(array));
	  }
	  
	  
}
