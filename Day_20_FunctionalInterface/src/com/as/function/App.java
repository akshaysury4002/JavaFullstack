package com.as.function;


public class App {
	  public static void basicsExplanation() {

	        System.out.println(Double.MAX_VALUE);
	        System.out.println(Integer.MAX_VALUE);
	        
	        double d = 90.89d;
	        int a = 10;

	        // big = small
	        double dd = a;

	        // small != big
	        // int aa = d;
	    }

	    public static void functionDemo() {

	        FiDemoes fd = new FiDemoes();
	        fd.demo10();
	    }

	    public static void main(String[] args) throws Exception {
	        System.out.println("🔥 Functional Interface 🔥");
	        functionDemo();
	    }

}