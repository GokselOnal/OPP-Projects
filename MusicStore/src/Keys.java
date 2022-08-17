public class Keys extends Product {
	private int keyNumber;

	public Keys(String productCode, double price, String brand) {
		super(productCode, brand);
		this.setPrice(price);
	}

	public void setKeyNumber(int keyNumber) {
		this.keyNumber = keyNumber;
	}

	public String toString() {
		return super.toString() + "\n" + "Number of Keys: " + this.keyNumber;
	}
}
