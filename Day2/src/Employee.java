public class Employee {
	//Fields
	static int empId=0;
	String eName;
	double basicsalary,grossSalary,netSalary;
	double HRA, PF,PT,medical;
	
	public Employee(String eName) {
		this.empId = this.empId+1;
		this.eName= eName;
	}
	
	public Employee(String eName, double basicSalary) {
		this(eName);
		this.basicsalary=basicSalary;
		this.HRA = 0.5 * this.basicsalary;
		this.PF= 0.12 * this.basicsalary;
		this.medical=100;
		this.PT=200;
	}
	
	public double calculategrossSalary() {
		return this.basicsalary + this.HRA + this.medical ;
	}
	
	public double calculatenetSalary() {
		return this.grossSalary - this.PT-this.PF;
	}
	

	//Methods
	public void printData() {
		System.out.println("Id:"+ empId);
		System.out.println("Name:"+ eName);
		System.out.println("basicSalary:"+ this.basicsalary);
		System.out.println("grossSalary:"+ calculategrossSalary());
		System.out.println("netSalary:"+ calculatenetSalary());
	}
}
