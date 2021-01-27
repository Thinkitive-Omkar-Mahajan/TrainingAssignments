package com.thinkitive;

public class factorial {
	public factorial() {
	}
	
	public static int CalculateFactorial(int n) {
		int fact=1;
		for(int i=n;i>0;i--) {
			fact = fact * i;
		}
		return fact;
	}
}
