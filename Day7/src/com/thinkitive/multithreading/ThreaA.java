package com.thinkitive.multithreading;

public class ThreaA implements Runnable {
	
	private Table ti;
	
	public ThreaA(Table t) {
		this.ti = t;
	}
	
	@Override
	public void run() {
		this.ti.table(2);
	}
}
