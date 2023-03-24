package com.as.anno;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class App {
	
	public static void main(String[] args) {
		
		 System.out.println("🔥 Annotations 🔥");
		 
		Tiger tiger=new Tiger();
		tiger.run();
		
		   String sts = CheckerImpl.checkField(tiger);
	        System.out.println(sts);
	        
	     // public static final Class<Tiger> class;
	        Class<Tiger> cls = Tiger.class;
	        System.out.println( cls.getName());
	        System.out.println(cls.getSimpleName());

	}

}
