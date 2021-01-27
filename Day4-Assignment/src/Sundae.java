public class Sundae extends IceCream {
	public float toppingCost;
	public Sundae() {
		
	}
	public Sundae(int n,float cost,float toppingCost) {
		super(n,cost);
		this.toppingCost=toppingCost;
	}
	
	@Override
	public double itemCost() {
		return super.itemCost() + this.toppingCost; 
	}
	
}
