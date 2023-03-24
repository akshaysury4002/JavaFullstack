package com.as.anno;

import java.util.ArrayList;
import java.util.List;

public class Tiger extends Animal {
	
	
	  @Checker
	    private int speed;

	    @Checker
	    private int Color;

	   

	@Override  //it will check the method is overridden or not
	public void walk()
	{
		
		
	}
	@SuppressWarnings("not good")
	public void run()
	{
		List ln=new ArrayList();
		ln.add(1);
	}
	
	@Deprecated
	public void runfast()
	{
		
	}
}
