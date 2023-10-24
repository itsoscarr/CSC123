//omirandaperez1@toromail.csudh.edu

public class Item {

	private String name;
	private String vendor;
	private double price;
	private double cost;
	private double weight;
	private double taxRate;
	
	public Item(String name, String vendor, double price, double cost, double weight, double taxRate) {
		super();
		this.name = name;
		this.vendor = vendor;
		this.price = price;
		this.cost = cost;
		this.weight = weight;
		this.taxRate = taxRate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	
	public double calculateTotalCost() {
		return getPrice() + (getPrice() * getTaxRate() / 100);
		
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", vendor=" + vendor + ", price=" + price + ", cost=" + cost + ", weight="
				+ weight + ", taxRate=" + taxRate + "]";
	}
}
