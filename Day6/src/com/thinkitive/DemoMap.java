package com.thinkitive;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String, Integer>();
		String s = "Hello World";
		String[] s1 = s.split("");
		
		for(String temp:s1) {
			if(map.containsKey(temp)) {
				map.put(temp, map.get(temp) + 1);
			}
			else {
				map.put(temp,1);
			}
		}
		
		System.out.println(map);
	}
}
