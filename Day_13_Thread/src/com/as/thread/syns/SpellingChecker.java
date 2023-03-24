package com.as.thread.syns;

public class SpellingChecker implements Runnable {
	
	private final ImpData dt;
	
	
	

	public SpellingChecker(ImpData dt) {
		super();
		this.dt = dt;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10000; i++) {
			dt.increment();
		}
	}
	
	

}
