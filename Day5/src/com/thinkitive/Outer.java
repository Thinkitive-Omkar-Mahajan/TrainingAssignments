package com.thinkitive;

public class Outer {

	public class Inner implements Iexecutable{

		@Override
		public int performAction(int a, int b) {
			return a+b;
		}
		 
	}
}
