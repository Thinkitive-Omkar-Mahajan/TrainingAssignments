package com.thinkitive.db;

import java.lang.reflect.Method;

public class Demo {
	public static void main(String[] args) {
		
		try {
			Class c = Class.forName("com.thinkitive.Employee");
			Method m[] = c.getDeclaredMethods();
			
			for(Method x:m) {
				System.out.println(x);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
