public class Flute extends Winds {
	private boolean eMechanism;

	public Flute(String productCode, String brand, String tuning) {
		super(productCode, brand, tuning);
		this.setPrice(1500);
		this.setTaxRate(15);
		this.setWeight(0.5);
		this.setMaterialKeys("Nickel Silver");
		this.eMechanism = false;
		this.setPriceRent(250);
	}

	@Override
	public void setWeight(double weight) {
		if(weight >=0 && weight <= 1.5) {
		super.setWeight(weight);
		}
		else {
			this.setWeight(0.5);
		}
	}

	public void seteMechanism(boolean eMechanism) {
		this.eMechanism = eMechanism;
	}

	public String toString() {
		return super.toString() + "\n" + "E-mechanism: " + this.eMechanism + "\n" + "Quantity: " + this.getQuantity();
	}

	public void infoForShopping() {
		System.out.println("///#Flute purchased#\\\\\\ \n");
		super.infoForShopping();
	}

	public void infoForShopping(int m) {
		System.out.println("///#Flute rented#\\\\\\ \n");
		super.infoForShopping(m);
	}
}
