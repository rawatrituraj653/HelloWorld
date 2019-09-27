package com.asif.array;

import java.util.Arrays;

public class Question7 {
     
	public static void alternateSort(int arr[] , int n)
	{
		Arrays.sort(arr);
		int i=0;
		int j=n-1;
		while(i<j)
		{
			System.out.print(arr[j--] + " ");
			System.out.print(arr[i++] +  " ");
			
		}
		
		//if the total element in array is odd 
		// then print the last element 
		if(n%2!=0)
		{
			System.out.print(arr[i]);
		}
		
	}
	
	
	   public static void main(String[] args) {
		
		    int arr[] = {10,20,30,40,50,60,70,80,90,100};
		    
		    int n= arr.length;
		    
		    alternateSort(arr, n);
		    
	}
}
