package com.thinkitive;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
	List<T> l = new ArrayList<T>();
		public void push(T data) {
			l.add(data);
		}
		
		public T pop() {
			return (T) l.remove(l.size()-1);
		}
		
		public void printData() {
			System.out.println(l);
		}
}
