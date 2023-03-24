package com.as.anno.genegetset;

public class App {
	
	public static void demo1() {
        Account ac = new Account();
        GetSetProcessor.generateAccessors(ac);
    }

	public static void main(String[] args) {
		demo1();
	}
}
