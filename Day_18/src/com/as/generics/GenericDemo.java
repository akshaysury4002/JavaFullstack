package com.as.generics;

import java.sql.Date;
import java.time.LocalDate;

public class GenericDemo {
	  public void demo1() {
	        Box bx = new Box();
	        // bx.setAnything(new String());
	       // bx.setAnything(new Date());
	        // bx.setAnything(new StringBuffer());
	        String ob = (String)bx.getAnything();
	    }

	    public void demo2() {
	        DynamicBox<String> db1 = new DynamicBox<String>();
	        db1.setAnything("abc");
	        String nm = db1.getAnything();

	        DynamicBox<LocalDate> db2 = new DynamicBox<LocalDate>();
	        db2.setAnything(LocalDate.now());
	        LocalDate dt = db2.getAnything();

	    }

	    public void demo3() {
//	        BoundedParam<Integer> bd1 = new BoundedParam<>();
//	        BoundedParam<Float> bd2 = new BoundedParam<>();
//	        BoundedParam<Number> bd3 = new BoundedParam<>();
	    }

}