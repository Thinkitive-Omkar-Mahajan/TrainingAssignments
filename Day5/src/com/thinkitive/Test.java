package com.thinkitive;

public class Test {
	public static void main(String[] args) {
			int a=10;
			int b=0;
			
			assert b>0:"Divide by zero error";
			System.out.println(a/b);
	}
}
