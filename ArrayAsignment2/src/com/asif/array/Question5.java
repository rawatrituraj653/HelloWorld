package com.asif.array;

public class Question5 {

	  public static void main(String[] args) {
		
		  
		  int array [] = {
				    1,6,6,5,7,4,1,7,7,7,7,7,7,7,2};
		  int n = array.length;
		  printLeaderElement(array,n );
	}
	  public static void printLeaderElement(int array[] , int n)
	  {
		  int maxCount = 0;
		  int index= -1;
		  for(int i=0;i<n ;i++)
		  {
			  int count =0;
			  for(int j=0;j<n ;j++)
			  {
				  if(array[i]==array[j])
				  {
					  count++;
				  }
			  }
			  
			  
			  if(count>maxCount)
			  {
				  maxCount= count;
				  index = i;
			  }
		  }
		  if (maxCount > n/2)  
			    System.out.println (array[index]);  
			      
			    else
			    System.out.println ("No Leader  Element found");
	  }
}
