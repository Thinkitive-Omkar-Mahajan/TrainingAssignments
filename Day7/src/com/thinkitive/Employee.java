package com.thinkitive;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
	private int eid;
	private String ename;
	private int salary;
	private Address address;
	
	public Employee() {
	}

	public Employee(int eid, String ename, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((ename == null) ? 0 : ename.hashCode());
		result = prime * result + salary;
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
		if (eid != other.eid)
			return false;
		if (ename == null) {
			if (other.ename != null)
				return false;
		} else if (!ename.equals(other.ename))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	public void doSerialize() {
		FileOutputStream fos=null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("demo.serial");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			oos = new ObjectOutputStream(fos);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			oos.writeObject(this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Employee doDeserialize() {
		Employee e=null;
		
		try {
			FileInputStream fis = new FileInputStream("demo.serial");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			e = (Employee) ois.readObject();
			
			ois.close();
			fis.close();
		}catch(Exception e1) {
			System.out.println(e1);
		}
		
		return e;
	}
}
