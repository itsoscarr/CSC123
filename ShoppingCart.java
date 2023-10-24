//omirandaperez1@toromail.csudh.edu
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Item> items;
	
	public ShoppingCart() {
		items = new ArrayList<>();
		
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public double calculateTotalCost() {
		double totalCost = 0;
		
		for(Item item : items) {
			
			totalCost += item.calculateTotalCost();
		}
		
		return totalCost;
	}
	
	public void printItems() {
		for(Item item : items) {
			System.out.println(item);
		}
	}
	
	public int getNumItems() {
		return items.size();
	}
}
