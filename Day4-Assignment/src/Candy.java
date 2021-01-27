
public class Candy extends DessertItem {
	public float weight;
	public float cost;
	public Candy() {
		
	}
	public Candy(float weight, float cost) {
		this.weight = weight;
		this.cost = cost;
	}
	@Override
	public double itemCost() {
		return (this.cost*this.weight)/1000 ;
	}

}
