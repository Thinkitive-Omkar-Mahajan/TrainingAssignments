package com.thinkitive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Practice {
	public static void main(String[] args) {
		List<Employee> m1 = new ArrayList<Employee>();
		m1.add(new Employee(1, "aa", 90));
		m1.add(new Employee(3, "aba", 880));
		m1.add(new Employee(2, "aab", 900));
		
		Collections.sort(m1);
		System.out.println(m1);
		
		ListIterator<Employee> empitr = m1.listIterator();
		
		while(empitr.hasNext()) {
			System.out.println(empitr.next());
		}
		
		System.out.println("In Reverse");
		
		while(empitr.hasPrevious()) {
			System.out.println(empitr.previous());
		}
	}
}
