package com.asif.array;

public class Question3 {
         
	    public static void main(String[] args) {
			
	    int array [] = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
	    
	     int length= array.length;
	     int count = 0 ;
	     for(int i =0 ; i<length ; i++)
	     {
	    	 if(array[i]==0)
	    	 {
	    		 count++;
	    	 }
	     }
	    	
	    	
	     for(int i=0;i<count; i++)
	     {
	    	 System.out.print( 0);
	     }
	    	
	     for(int i=count;i<array.length; i++)
	     {
	    	 System.out.print(1);
	     }
		}
}
