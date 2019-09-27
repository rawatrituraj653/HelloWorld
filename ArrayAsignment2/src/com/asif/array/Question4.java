package com.asif.array;

public class Question4 {
        
	   public static void main(String[] args) {
		
		    int array [] = {0, 1, 0, 2, 0, 0, 2, 1, 2, 0};
		    int count1=0;
		    int count2=0;
		    int count3=0;
		    
		    for(int i =0 ; i<array.length;i++)
		    {
		    	if(array[i]==0)
		    	{
		    		count1++;
		    	}
		    	else if(array[i]==1)
		    	{
		    		count2++;
		    	}
		    	else
		    	{
		    		count3++;
		    	}
		    }
		    
		    
		    for(int i=0;i<count1;i++)
		    {
		    	System.out.print(0 +" ");
		    }
		    
		    
		    for(int i=count1; i<count1+count2;i++)
		    {
		    	System.out.print(1 + " ");
		    }
		    
		    for(int i = count1+count2 ; i<array.length; i++)
		    {
		    	System.out.print(2 + " ");
		    }
		    
		   	}
}
