public class Keyboard extends Keys {
	private boolean speakers;

	public Keyboard(String productCode, double price, String brand) {
		super(productCode, price, brand);
		this.setKeyNumber(61);
		this.speakers = true;
		this.setPriceRent(200);
	}

	@Override
	public void setKeyNumber(int keyNumber) {
		if(keyNumber >= 0 && keyNumber <= 88) {
		super.setKeyNumber(keyNumber);
		}
		else {
			this.setKeyNumber(32);
		}
	}

	public String toString() {
		return super.toString() + "\n" + "Speakers: " + this.speakers + "\n" + "Quantity: " + this.getQuantity();
	}

	public void infoForShopping() {
		System.out.println("///#Keyboard purchased#\\\\\\ \n");
		super.infoForShopping();
	}

	public void infoForShopping(int m) {
		System.out.println("///#Keyboard rented#\\\\\\ \n");
		super.infoForShopping(m);
	}
}
