package com.nit.asif;

public class MaxMin {

	 public static void main(String[] args) {
		
		 int array [] = {1, 2, 5, 5, 6, 6, 7, 2,10};
		 
		 int max= array[0];
		 
		 int min =  array[0];
		 for(int i =0 ; i<array.length; i++)
		 {
			 if(array[i] > max)
			 {
				 max= array[i];
			 }
		 }
		 
		 
		 System.out.println("max is array : " + max);
		 System.out.println("-----------------------------");
		 
		 
		 for(int i = 0 ; i<array.length; i++)
		 {
			 if(array[i]<min)
			 {
				 min= array[i];
			 }
		 }
		 
		 System.out.println("min in the array : " + min);
	}
}
