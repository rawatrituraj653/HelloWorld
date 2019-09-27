package com.asif.array;

public class Question6
{
	public static void main(String[] args) {
		
		int array [] = {1,5,3,6};
		int n = array.length;
		computeSuperElement(array, n);
	}

	public static void computeSuperElement(int array[] , int n)
	{
		 int count =0;
		  
		 for(int i =0; i<n ; i++)
		 {
		 	 for(int j =0 ; j<n ; j++)
		 	 {
		 	 	 if(array[i]<array[j])
		 	 	 {
		 	 	 	count++;
		 	 	 	if(count>2)
		 	 	 	{  
		 	 	 		
		 	 	 		System.out.print(array[i]);
		 	 	 		count=0;
		 	 	 		
		 	 	 	}
		 	 	 }
		 	 }
		 }
	}
}
