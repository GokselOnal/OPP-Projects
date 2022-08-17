import java.util.ArrayList;

public class Shopping {
	private ArrayList<Product> shoppingBuy;
	private ArrayList<Product> shoppingRent;

	public Shopping() {
		this.shoppingBuy = new ArrayList<Product>();
	}

	public Shopping(String s) {
		this.shoppingRent = new ArrayList<Product>();
	}

	public void buy(Product product) {
		this.shoppingBuy.add(product);
	}

	public void buy(Product product, int months) {
		this.shoppingRent.add(product);
	}

	public double calculateTotalPrice() {
		double totprice = 0;
		for (int i = 0; i < shoppingBuy.size(); i++) {
			double priceWithTaxRate = (shoppingBuy.get(i).getPrice()
					+ (shoppingBuy.get(i).getPrice() * (shoppingBuy.get(i).getTaxRate() / 100)));
			totprice += priceWithTaxRate;
		}
		return totprice;
	}

	public double calculateTotalPriceForRent() {
		double totprice = 0;
		for (int j = 0; j < shoppingRent.size(); j++) {
			double priceRentWithTaxRate = (shoppingRent.get(j).getPriceRent()
					+ (shoppingRent.get(j).getPriceRent() * (shoppingRent.get(j).getTaxRate() / 100)));
			totprice += priceRentWithTaxRate;
		}
		return totprice;
	}

	public void showShoppingInfo() {
		System.out.println(" _________________________________________________");
		System.out.println("      \\m/*******Göksel Music Store*******\\m/\n");
		System.out.println(" -------------------------------");
		for (int i = 0; i < shoppingBuy.size(); i++) {
			shoppingBuy.get(i).infoForShopping();
			System.out.println(" �������������������������������");
		}

		System.out.println(" Total price:                        " + calculateTotalPrice());
		System.out.println("����������������������������������������������");
		System.out.println(" _________________________________________________");
		System.out.println("               Have A Nice Day\n");
	}

	public void showShoppingInfo(int m) {
		System.out.println(" _________________________________________________");
		System.out.println("      \\m/*******Göksel Music Store*******\\m/\n");
		System.out.println(" -------------------------------");
		for (int i = 0; i < shoppingRent.size(); i++) {
			shoppingRent.get(i).infoForShopping(m);
			System.out.println(" Rental months: " + m);
			System.out.println(" �������������������������������");
		}
		System.out.println(" Total price:                        " + (m * calculateTotalPriceForRent()));
		System.out.println("����������������������������������������������");
		System.out.println(" _________________________________________________");
		System.out.println("               Have A Nice Day\n\n");
	}
}