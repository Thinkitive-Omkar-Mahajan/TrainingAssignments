package com.thinkitive;

import com.thinkitive.Outer.Inner;

public class Demo{

	public static void main(String[] args) {
		
		Iexecutable add = new Iexecutable() {
			
			@Override
			public int performAction(int a, int b) {
				return a+b;
			}
		};
		
		Iexecutable sub = (a,b) -> a-b; 
		
		System.out.println(sub.performAction(90, 88));
	}

}
