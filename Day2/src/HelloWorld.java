public class HelloWorld{
	public static void main(String[] args) {
		int a[] = {2,3,4,7};
		int b[] = {2,3,7,4};
		
		int c = 0;
		for(int x:a) {
			for(int y:b) {
				if(x==y) {
					c++;
					break;
				}
			}
		}
		
		if(c==a.length && c==b.length) {
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
	}
}