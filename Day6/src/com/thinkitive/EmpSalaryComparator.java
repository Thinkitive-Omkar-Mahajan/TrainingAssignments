package com.thinkitive;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee)o1;
		Employee e2 = (Employee)o2;
		if(e1.geteSalary() > e2.geteSalary()) {
			return 1;
		}
		else if(e1.geteSalary() < e2.geteSalary()) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
