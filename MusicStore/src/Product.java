public class Product {
	private String productCode;
	private double price;
	private double priceRent;
	private double taxRate;
	private String brand;
	private int quantity;

	public Product(String productCode) {
		this.productCode = productCode;
		this.price = 1500;
		this.priceRent = 250;
		this.taxRate = 18;
		this.quantity = 0;
	}

	public Product(String productCode, String brand) {
		this.productCode = productCode;
		this.brand = brand;
		this.price = 1500;
		this.priceRent = 250;
		this.taxRate = 18;
		this.quantity = 0;
	}

	public Product(double taxRate, String brand) {
		this.taxRate = taxRate;
		this.brand = brand;
		this.price = 1500;
		this.priceRent = 250;
		this.quantity = 0;
	}

	public String getProductCode() {
		return productCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPriceRent() {
		return priceRent;
	}

	public void setPriceRent(double priceRent) {
		this.priceRent = priceRent;
	}
	
	public String toString() {
		return "Code: " + this.productCode + "\n" + "Price for purchase: " + this.price + "TL\n" + "Price for Rent: "
				+ this.priceRent + "TL\n" + "Tax rate: " + this.taxRate + "\n" + "Brand: " + this.brand;
	}

	public void infoForShopping() {
		System.out.println(" Code: " + this.productCode + "\n" + " Price: " + this.price + "TL\n" + " Tax rate: "
				+ this.taxRate + "\n" + " Brand: " + this.brand);
	}

	public void infoForShopping(int m) {
		System.out.println(" Code: " + this.productCode + "\n" + " Price for Rent: " + this.priceRent + "TL\n"
				+ " Tax rate: " + this.taxRate + "\n" + " Brand: " + this.brand);
	}
}
