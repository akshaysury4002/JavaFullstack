package com.as;

import com.as.date.DateDemo;

public class App {
	
	 public static void demo1() {
	        com.as.StringDemos sd = new com.as.StringDemos();
	        sd.demo2();

	        com.as.Animal an = new com.as.Animal();
	        an.st();
	        
	        com.as.date.Animal an1 = new com.as.date.Animal();
	        an1.dt();
	    }

	    public static void demo2() {
	        StringDemos sd = new StringDemos();
	        sd.demo5();
	    }

	    public static void demo3() {
	        DateDemo dd = new DateDemo();
	        dd.demo1();
	    }
	    public static void main(java.lang.String[] args) throws java.lang.Exception {
	        java.lang.System.out.println("🔥 String, Date, Warapper 🔥");

	       demo3();
	    }

}
