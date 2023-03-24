package com.as.samestring;

public class Rotation 
{
	public boolean isRotationEqual(String a,String b)
	{
		boolean n=true;
		String c="";
		if(a.length()==b.length())
		{
			for (int i = a.length()-1; i >=0; i--) 
			{
				c+=a.charAt(i);	
			}
			if(!c.equalsIgnoreCase(b))
			{
				n=false;
			}
			
		}
		else
		{
			n=false;
		}
		return n;
	}

}
