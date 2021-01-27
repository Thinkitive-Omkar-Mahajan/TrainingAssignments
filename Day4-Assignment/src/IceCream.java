public class IceCream extends DessertItem {
	public float cost;
	public int n;
	public IceCream() {
		// TODO Auto-generated constructor stub
	}
	public IceCream(int n,float cost) {
		this.n=n;
		this.cost =cost;
	}
	@Override
	public double itemCost() {
		return (this.n*this.cost);
	}

}
