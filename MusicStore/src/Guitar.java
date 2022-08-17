public class Guitar extends Strings {
	private String shape;
	private int fretNumbers;
	private String stringGauge;

	public Guitar(String productCode, String brand, boolean acoustic, String color, String shape) {
		super(productCode, brand, color, acoustic);
		this.setPrice(2500);
		this.setTaxRate(25);
		this.shape = shape;
		this.setStringNumbers(6);
		this.fretNumbers = 24;
		this.stringGauge = "09-46";
		this.setPriceRent(250);
	}

	@Override
	public void setStringNumbers(int stringNumbers) {
		if (stringNumbers >= 1 && stringNumbers <= 8) {
			super.setStringNumbers(stringNumbers);
		} else {
			this.setStringNumbers(6);
		}
	}

	public void setFretNumbers(int fretNumbers) {
		this.fretNumbers = fretNumbers;
	}

	public void setStringGauge(String stringGauge) {
		this.stringGauge = stringGauge;
	}

	public String toString() {
		return super.toString() + "\n" + "Shape: " + this.shape + "\n" + "Number of Frets: " + this.fretNumbers + "\n"
				+ "String Gauge: " + this.stringGauge + "\n" + "Quantity: " + this.getQuantity();
	}

	public void infoForShopping() {
		System.out.println("///#Guitar purchased#\\\\\\ \n");
		super.infoForShopping();
	}

	public void infoForShopping(int m) {
		System.out.println("///#Guitar rented#\\\\\\ \n");
		super.infoForShopping(m);
	}
}





