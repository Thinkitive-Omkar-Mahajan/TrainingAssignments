public class TestCheckout {
	public static void main(String[] args) {
		Checkout c= new Checkout();
		DessertItem[] item = {
				new Candy(10,2), 
				new IceCream(10,20)
				};
		
		c.addItemToCashRegister(item);
		System.out.println(c.getReceipt());
	}
}
