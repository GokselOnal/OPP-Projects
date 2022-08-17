public class Strings extends Product {
	private String color;
	private boolean acoustic;
	private int stringNumbers;

	public Strings(String productCode, String brand, String color, boolean acoustic) {
		super(productCode, brand);
		this.color = color;
		this.acoustic = acoustic;
	}

	public Strings(String productCode, String brand) {
		super(productCode, brand);
		this.setBrand(brand);
		this.color = "brown";
	}

	public void setAcoustic(boolean acoustic) {
		this.acoustic = acoustic;
	}

	public void setStringNumbers(int stringNumbers) {
		this.stringNumbers = stringNumbers;
	}

	public String toString() {
		return super.toString() + "\n" + "Acoustic: " + this.acoustic + "\n" + "Color: " + this.color + "\n"
				+ "Number of Strings: " + this.stringNumbers;
	}
}


