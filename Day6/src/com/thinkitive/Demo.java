package com.thinkitive;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		Set<Employee> l= new TreeSet<Employee>();
		
		l.add(new Employee(1,"ABC", 1000));
		l.add(new Employee(2,"AB", 1000));
		l.add(new Employee(1,"ABC", 1000));
		
		
		System.out.println(l);
	}
}
