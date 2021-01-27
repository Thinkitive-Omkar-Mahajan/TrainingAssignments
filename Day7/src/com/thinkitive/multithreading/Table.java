package com.thinkitive.multithreading;

import java.util.ArrayList;
import java.util.List;

public class Table {
	public Table() {
	}
	public void table(int n){
		synchronized (this) {
			for(int i=1;i<=10;i++) {
				System.out.println( Thread.currentThread().getName() + ":" + n*i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
