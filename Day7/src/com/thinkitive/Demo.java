package com.thinkitive;

public class Demo {
	public static void main(String[] args) {
		Employee e = new Employee(1,"abc",19);
		
		Employee temp = new Employee();
		
		e.doSerialize();
		
		temp = temp.doDeserialize();
		System.out.println(temp);
	}
}
