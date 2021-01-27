public class Demo {
	public static void main(String args[]) {
		Manager m = new Manager("ABC",10000);
		MarketingExecutive mr = new MarketingExecutive("ABC",10000,20);
		
		System.out.println(m.basicsalary);
		System.out.println(m.calculategrossSalary());
		System.out.println(m.calculatenetSalary());
		
		System.out.println(mr.basicsalary);
		System.out.println(mr.calculategrossSalary());
		System.out.println(mr.calculatenetSalary());
	}
}
