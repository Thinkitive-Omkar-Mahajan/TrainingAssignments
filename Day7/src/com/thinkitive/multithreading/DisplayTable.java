package com.thinkitive.multithreading;

public class DisplayTable {

	public static void main(String[] args) {
		Table t = new Table();
		ThreaA a = new ThreaA(t);
		ThreadB b = new ThreadB(t);
		
		Thread a1 = new Thread(a);
		Thread a2 = new Thread(b);
		
		a1.setName("T1");
		a2.setName("T2");
		
		a1.start();
		a2.start();
	}
}
