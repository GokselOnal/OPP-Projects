public class Piano extends Keys {
	private int pedalNumbers;
	private String type;
	private boolean wheels;

	public Piano(String productCode, double price, String brand, String type, boolean wheels) {
		super(productCode, price, brand);
		this.setTaxRate(30);
		this.pedalNumbers = 3;
		this.type = type;
		this.setKeyNumber(88);
		this.setPriceRent(450);
	}

	@Override
	public void setKeyNumber(int keyNumber) {
		super.setKeyNumber(88);
	}

	public void setPedalNumbers(int pedalNumbers) {
		this.pedalNumbers = pedalNumbers;
	}

	public String toString() {
		return super.toString() + "\n" + "Type: " + this.type + "\n" + "Number of Pedals: " + this.pedalNumbers + "\n"
				+ "Wheels: " + this.wheels + "\n" + "Quantity: " + this.getQuantity();
	}

	public void infoForShopping() {
		System.out.println("///#Piano purchased#\\\\\\ \n");
		super.infoForShopping();
	}

	public void infoForShopping(int m) {
		System.out.println("///#Piano rented#\\\\\\ \n");
		super.infoForShopping(m);
	}
}
