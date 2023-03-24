package com.as.countchar;

import java.util.HashMap;
import java.util.*;

public class CharacterCount 
{
	public String charcount(String ip)
	{
		String s1="";
		Map<Character, Integer> map = new HashMap<>();
		char[]c=ip.toCharArray();
		
		
		for (char el : c) {
			if(map.containsKey(el))
			{
				map.put(el, map.get(el)+1);
			}
			else
			{
				map.put(el, 1);
			}
		}
		
		  Set<Character> keys = map.keySet();  
	        for (Character ch : keys) {  
	            if (map.get(ch) > 1) {  
	               s1+=ch;
	               s1+=map.get(ch)+",";
	            }
	        }
	        String s2="";
	        for (int i = 0; i < s1.length()-1; i++) {
				s2+=s1.charAt(i);
			}
	System.out.println(s2);
	        return s2;
		
	}

}
