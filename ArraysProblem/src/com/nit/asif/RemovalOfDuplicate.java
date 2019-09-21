package com.nit.asif;

import java.util.HashSet;
import java.util.Set;

public class RemovalOfDuplicate {

	  public static void main(String[] args) {
		
		  int array[]= {1,2,5,5,6,6,7,2};
		  
		 Set<Integer>  elementSet = new HashSet<Integer>();
		 
		 for(int i=0; i<array.length; i++)
		 {
			  elementSet.add(array[i]);
		 }
		 
		 elementSet.parallelStream().forEach(System.out::println);
 	}
}
