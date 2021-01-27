public abstract class DessertItem {
	public String name;
	
	public DessertItem() {
	}
	
	public DessertItem(String name) {
		this.name = name;
	}
	
	public abstract double itemCost();
	
	public final String getName() {
		return this.name;
	}
}
