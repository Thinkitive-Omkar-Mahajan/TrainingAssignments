public class MarketingExecutive extends Employee{
	private double tourAllowance;
	private double phoneAllowance;
	
	public MarketingExecutive(String eName, double basicSalary, int km) {
		super(eName, basicSalary);
		tourAllowance = 5*km;
		phoneAllowance = 1500;
	}
	
	@Override
	public double calculategrossSalary() {
		return super.calculategrossSalary() + this.tourAllowance + this.phoneAllowance;
	}
	
	@Override
	public double calculatenetSalary() {
		return calculategrossSalary() - super.PT-super.PF;
	}
}
