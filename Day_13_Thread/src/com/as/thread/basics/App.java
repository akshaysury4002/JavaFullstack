package com.as.thread.basics;

import com.as.thread.itc.ItcHub;
import com.as.thread.itc.NumConsumer;
import com.as.thread.itc.NumProducer;
import com.as.thread.syns.GrammerChecker;
import com.as.thread.syns.ImpData;
import com.as.thread.syns.SpellingChecker;

public class App {
	
	public static void demo1()
	{
		ThreadOne one=new ThreadOne();
		one.start();
		
		Runnable run=new ThreadTwo();
		Thread t1=new Thread(run);
		t1.start();
		
	}
	
	public static void demo2() {

        ImpData dt = new ImpData();

        Runnable task1 = new SpellingChecker(dt);
        Thread t1 = new Thread(task1);
      
        Runnable task2 = new GrammerChecker(dt);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
           System.out.println("There is a problem");
        }

        dt.currentCount();
    }

	
	 public static void demo3() {

	        ItcHub hub = new ItcHub();

	        Runnable producer = new NumProducer(hub);
	        Thread t1 = new Thread(producer);

	        Runnable consumer = new NumConsumer(hub);
	        Thread t2 = new Thread(consumer);

	        t1.start();
	        t2.start();
	    }

	
	
	public static void main(String[] args) {
		//demo1();
		
		System.out.println("🔥 Threading 🔥");
		//demo2();
		demo3();
	}

}
