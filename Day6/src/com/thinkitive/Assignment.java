package com.thinkitive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignment {
	public static void main(String[] args) {
		List<Employee> e1 = new ArrayList<Employee>();
		
		e1.add(new Employee(1, "abc", 90));
		e1.add(new Employee(2, "ac", 9));
		e1.add(new Employee(3, "aac", 89));
		
		EmpSalaryComparator sal = new EmpSalaryComparator();
		Collections.sort(e1, sal);
		System.out.println(e1);
		
		
	}
}
