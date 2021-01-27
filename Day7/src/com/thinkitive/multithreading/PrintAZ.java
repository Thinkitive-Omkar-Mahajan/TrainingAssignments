package com.thinkitive.multithreading;

public class PrintAZ extends Thread {
	@Override
	public void run() {
		for(char i='A'; i<='Z'; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
