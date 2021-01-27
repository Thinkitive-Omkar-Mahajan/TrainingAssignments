package com.thinkitive;

import java.util.Comparator;

public class Address implements Comparable {
	private String city;
	private int pincode;
	
	public Address() {
	
	}
	
	public Address(String city, int pincode) {
		super();
		this.city = city;
		this.pincode = pincode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public int compareTo(Object o) {
		Address p= (Address) o;
		if(this.pincode > p.pincode) {
			return 1; 
		}
		else if(this.pincode < p.pincode) {
			return -1;
		}
		else
			return 0;
	}
	
	
	
}
