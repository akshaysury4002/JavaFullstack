package com.as;

public class RemoveChar 
{
	public String remChar(String s,String a)
	{
		String sub="";
		String[]x=s.split("");
		
		int index=s.indexOf(a);
		if(s.length()==0)
		{
			return "Invalid String";
		}
		else if(a.length()==0)
		{
			return "Specify the character to be removed";
		}
		else if(s.indexOf(a)!=-1)
		{
			sub+= s.substring(0, index);
			sub+=s.substring(index+1);
			
		}
		else
		{
			return "There is no " + a +" in string";
		}
		if(sub.length()==0)
			
		{
			return "nothing remains";
		}
		
		return sub;		
	}

}
