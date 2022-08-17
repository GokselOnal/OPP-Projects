public class Winds extends Product {
	private String tunning;
	private double weight;
	private String materialKeys;

	public Winds(String productCode, String brand, String tunning) {
		super(productCode);
		this.setBrand(brand);
		this.tunning = tunning;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setMaterialKeys(String materialKeys) {
		this.materialKeys = materialKeys;
	}

	public String toString() {
		return super.toString() + "\n" + "Weight: " + this.weight + "\n" + "Material Keys: " + this.materialKeys + "\n"
				+ "Tunning: " + this.tunning;
	}
}
