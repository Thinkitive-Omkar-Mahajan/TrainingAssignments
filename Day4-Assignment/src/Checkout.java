public class Checkout {
	private DessertItem[] items;
	private int current;
	private double cost;
	
	public Checkout() {
		items = new DessertItem[20];
		current =0;
	}
	
	public void addItemToCashRegister(DessertItem[] item) {
		this.items = item;
	}
	
	public void clearCashRegister() {
		items = new DessertItem[20];
		current =0;
	}
	
	public String getReceipt() {
		return this.toString();
	}

	
	@Override
	public String toString() {
		String items="";
		int c=0;
		for(DessertItem temp:this.items) {
			c = c+1;
			this.cost = this.cost + temp.itemCost();
			items = items + temp.getClass().toString().replace("class ", "")+", ";
		}
		clearCashRegister();
		System.out.println("Items Cleared Successfully");
		return "No. of Items:"+ c +" TotalCost:"+ this.cost + "Items:" + items;
	}
}
