//omirandaperez1@toromail.csudh.edu
public class Food extends Item{

	private String sellBy;
	private String useBy;
	public Food(String name, String vendor, double price, double cost, double weight, double taxRate, String sellBy,
			String useBy) {
		super(name, vendor, price, cost, weight, taxRate);
		this.sellBy = sellBy;
		this.useBy = useBy;
	}
	
	public double calculateTotalCost() {
		return getPrice() + (getPrice() * getTaxRate() / 100);
	}

	@Override
	public String toString() {
		return "Food [sellBy=" + sellBy + ", useBy=" + useBy + "]";
	}
	
	
}
