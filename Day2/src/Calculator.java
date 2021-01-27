public class Calculator {
	
	public int Add(int a, int b) {
		return a+b;
	}
	public float Add(float a, int b) {
		return a+b;
	}
	public float Add(int a, float b) {
		return a+b;
	}
	public int Add(byte a, byte b) {
		return a+b;
	}
	public int Add(float x,int... a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		return sum;
	}
	
	public int Sub(int a, int b) {
		return a-b;
	}
	public int Mul(int a, int b) {
		return a*b;
	}
	public int Div(int a, int b) {
		return a/b;
	}
}
