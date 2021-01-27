package com.thinkitive;

public class Employee implements Comparable  {
	private int eId;
	private String eName;
	private float eSalary;
	private Address eAddress;
	
	public Employee() {
	}
	
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public float geteSalary() {
		return eSalary;
	}

	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}

	public Employee(int eId, String eName, float eSalary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	@Override
	public String toString() {
		return "[Id: "+ this.eId+ " Name: "+ this.eName+ " Salary: " + this.eSalary+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eId;
		result = prime * result + ((eName == null) ? 0 : eName.hashCode());
		result = prime * result + Float.floatToIntBits(eSalary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eId != other.eId)
			return false;
		if (eName == null) {
			if (other.eName != null)
				return false;
		} else if (!eName.equals(other.eName))
			return false;
		if (Float.floatToIntBits(eSalary) != Float.floatToIntBits(other.eSalary))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object o) {
		Employee p = (Employee) o;
		if(this.eId > p.eId) {
			return 1; 
		}
		else if(this.eId < p.eId) {
			return -1;
		}
		else
			return 0;
	}
	
}
