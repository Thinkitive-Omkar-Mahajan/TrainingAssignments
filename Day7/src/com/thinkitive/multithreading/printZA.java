package com.thinkitive.multithreading;

public class printZA implements Runnable {
	
	@Override
	public void run() {
		for(char i='z'; i>='a'; i--) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
