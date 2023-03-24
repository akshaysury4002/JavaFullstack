package com.as.uniquesubstring;

public class UniqueSubString 
{
	public String check(String s)
	{
		
		String subs="";
		boolean[]b=new boolean[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			if(!b[i])
			{
				subs+=s.charAt(i);
				
				for (int j =i+1; j < s.length(); j++) {
					if(s.charAt(i)==s.charAt(j))
					{
						b[j]=true;
					}
					
				}
			}
			
			
		}
		
		return subs;
	}

}
