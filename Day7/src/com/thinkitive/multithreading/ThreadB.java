package com.thinkitive.multithreading;

public class ThreadB implements Runnable {
	private Table ti;
	
	public ThreadB(Table t) {
		this.ti = t;
	}
	
	@Override
	public void run() {
		this.ti.table(7);
	}
}
