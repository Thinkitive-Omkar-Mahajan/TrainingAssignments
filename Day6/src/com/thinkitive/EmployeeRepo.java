package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepo{
	List l = new ArrayList<EmployeeRepo>();
	
	
	public EmployeeRepo() {
	}
	
	public void addEmployee(Employee data) {
		l.add(data);
	}
	
	public void deleteEmployee(Employee e) {
		l.remove(e);
	}
	
	public void UpdateEmployee(int index, Employee e) {
		l.set(index, e);
	}
	
	public void getAll() {
		System.out.println(l);
	}
	
	public Employee getOne(int index) {
		return (Employee) l.get(index);
	}

	
}
