public class AdvancedCalculator extends Calculator {
	public int fact(int num) {
		int fact = 1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	@Override
	public int div(int a,int b) {
		System.out.println(super.div(a, b));
		return a%b;
	}
}
