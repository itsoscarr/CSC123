//omirandaperez1@toromail.csudh.edu
public class Publication extends Item{

	private String author;
	private int PageNumber;
	private String publicationMonth;
	
	public Publication(String name, String vendor, double price, double cost, double weight, double taxRate,
			String author, int pageNumber, String publicationMonth) {
		super(name, vendor, price, cost, weight, taxRate);
		this.author = author;
		PageNumber = pageNumber;
		this.publicationMonth = publicationMonth;
	}
	
	public double calculateTotalCost() {
		return getPrice() + (getPrice() * getTaxRate() / 100);
		
	}

	@Override
	public String toString() {
		return "Publication [author=" + author + ", PageNumber=" + PageNumber + ", publicationMonth=" + publicationMonth
				+ "]";
	}
	
	
}
