
public class Manager extends Employee {
	private double foodAllowance;
	private double managerAllowance;
	private double otherAllowance;
	public Manager(String eName, double basicSalary) {
		super(eName, basicSalary);
		foodAllowance = 0.08 * basicSalary;
		managerAllowance = 0.1*basicSalary;
		otherAllowance = 0.03 * basicSalary;
	}
	
	@Override
	public double calculategrossSalary() {
		return super.calculategrossSalary() + this.foodAllowance +this.managerAllowance + this.otherAllowance ;
	}
	
	@Override
	public double calculatenetSalary() {
		return calculategrossSalary() - super.PT-super.PF;
	}
}
