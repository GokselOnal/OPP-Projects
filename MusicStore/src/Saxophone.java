public class Saxophone extends Winds {
	private String type;

	public Saxophone(String productCode, String brand, String tunning, String type) {
		super(productCode, brand, tunning);
		this.setPrice(4500);
		this.setTaxRate(22);
		this.setWeight(3.5);
		this.setMaterialKeys("Brass");
		this.type = type;
		this.setPriceRent(400);
	}

	public String toString() {
		return super.toString() + "\n" + "Type: " + this.type + "\n" + "Quantity: " + this.getQuantity();
	}

	public void infoForShopping() {
		System.out.println("///#Saxophone purchased#\\\\\\ \n");
		super.infoForShopping();
	}

	public void infoForShopping(int m) {
		System.out.println("///#Saxophone rented#\\\\\\ \n");
		super.infoForShopping(m);
	}
}
