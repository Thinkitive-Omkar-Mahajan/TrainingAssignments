package com.thinkitive.multithreading;

public class Demo {
	public static void main(String[] args) {
		printZA z = new printZA();
		Thread a = new Thread(z);
		Thread b = new Thread(z);
		
		a.start();
		b.start();
	}
}
