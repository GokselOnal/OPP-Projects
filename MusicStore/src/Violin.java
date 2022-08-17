public class Violin extends Strings {
	private boolean handMade;
	private String size;

	public Violin(String productCode, double price, String brand, boolean handMade, String size) {
		super(productCode, brand);
		this.setPrice(price);
		this.setTaxRate(20);
		this.setAcoustic(true);
		this.handMade = handMade;
		this.setStringNumbers(4);
		this.size = size;
		this.setPriceRent(190);
	}

	@Override
	public void setStringNumbers(int stringNumbers) {
		super.setStringNumbers(4);
	}

	public String toString() {
		return super.toString() + "\n" + "Hand Made: " + this.handMade + "\n" + "Size: " + this.size + "\n"
				+ "Quantity: " + this.getQuantity();
	}

	public void infoForShopping() {
		System.out.println("///#Violin purchased#\\\\\\ \n");
		super.infoForShopping();
	}

	public void infoForShopping(int m) {
		System.out.println("///#Violin rented#\\\\\\ \n");
		super.infoForShopping(m);
	}
}
