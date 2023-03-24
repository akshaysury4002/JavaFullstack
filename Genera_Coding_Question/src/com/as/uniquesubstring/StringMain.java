package com.as.uniquesubstring;


public class StringMain 
{
	
	public static void main(String[] args) {
		
		
		UniqueSubString subs1=new UniqueSubString();
		String s=subs1.check("abcabccbar");
		
		StringInput input=new StringInput();
		input.setS(s);
		
		System.out.println(input.getS());
		
	}

}
