package com.thinkitive;

public class Demo {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "osm", "cpn");
		Employee e2 = new Employee(2, "parth", "cpn");
		Employee e3 = new Employee(3, "Avi", "pqr");
		
		CRUDClass c = new CRUDClass();
		//c.Create();
		//c.Update("osm", "omkar");
		c.Delete("omkar");
		c.Read();
		c.Close();
	}
}
