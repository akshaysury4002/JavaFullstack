package com.as;

public class TypeChecker {
	public void checkType1(Object object)
	{
		if(object instanceof String)
		{
			System.out.println("string");
		}
		else if(object instanceof Integer)
		{
			System.out.println("integer");
		}
		
	}
	

}
