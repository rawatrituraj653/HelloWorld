package com.nit.asif;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SumOfUniqueElement {

	  public static void main(String[] args) {
		
		   int array[] = {1,6,4,3,2,2,3,8,1};
		   
		    Set<Integer>  unique= new HashSet<Integer>();
		    for(int i =0 ; i< array.length;i++)
		    {
		    	unique.add(array[i]);
		    }
		    
		    int sum = 0;
		    
		    Iterator<Integer>  itr = unique.iterator();
		    
		    while(itr.hasNext())
		    {
		    	sum = sum + itr.next();
		    }
		    System.out.println(sum);
		   
	}
}
