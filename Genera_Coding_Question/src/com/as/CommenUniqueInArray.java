package com.as;

import java.util.*;

public class CommenUniqueInArray {
	
	public void commenEle(Integer[]a,Integer[]b)
	{
		    
		   Set<Integer>numbers=new HashSet<>();
		   
		   for (Integer el : a) {
			numbers.add(el);
		   }
		   for (Integer el : b) {
				numbers.add(el);
			}
		    
		    System.out.println("Unique elements in array: " + numbers);
		    
		    ArrayList<Integer> common = new ArrayList<Integer>();
		    
		    ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(a));
		    
		    for (int i = 0; i < a.length; i++) {
		       
		            if (a1.contains(b[i])) {
		                common.add(b[i]);
		            
		        }
		    }
		    System.out.println("Common elements: " + common);
	}

}
