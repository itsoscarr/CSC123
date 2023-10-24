//omirandaperez1@toromail.csudh.edu
public class Shopping {

	public static void main(String[] args) {

		 ShoppingCart cart = new ShoppingCart();
		 
		 cart.addItem(new Publication("Mocking Bird", "Publisher1", 20.0, 10.0, 1.0, 8.0, "Author1", 300, "Jan 2023"));
		 cart.addItem(new Food("Apple ", "Grocery Store", 5.0, 3.0, 0.5, 4.0, "Jan 10, 2023", "Jan 15, 2023"));
		 cart.addItem(new Item("Shirt ", "Vendor1", 15.0, 10.0, 2.0, 6.0) {
			 
		
			 public double calculateTotalCost() {
				 return getPrice() + (getPrice() * getTaxRate() / 100);
				 }
			 });
		 // print
		 cart.printItems();
		 
		 
		 // Calculate and print total cost
		 double totalCost = cart.calculateTotalCost();
		 System.out.println("Total Cost: $" + totalCost);
	}

}
