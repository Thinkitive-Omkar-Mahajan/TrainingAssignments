
public class Cookie extends DessertItem {
	public float cost;
	public int n;
	
	public Cookie() {
		// TODO Auto-generated constructor stub
	}
	
	public Cookie(int n, float cost) {
		this.n = n;
		this.cost =cost;
	}
	@Override
	public double itemCost() {
		// TODO Auto-generated method stub
		return (this.cost/12) * this.n;
	}

}
