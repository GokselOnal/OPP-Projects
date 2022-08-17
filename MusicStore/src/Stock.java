import java.util.ArrayList;

public class Stock {
	private ArrayList<Product> stockArrayL;

	public Stock() {
		this.stockArrayL = new ArrayList<Product>();
	}

	public ArrayList<Product> getStockArrayL() {
		return stockArrayL;
	}

	public void addProduct(Product product) {
		this.stockArrayL.add(product);
	}

	public void removeProduct(Product product) {
		this.stockArrayL.remove(product);
	}

	public void showProductsInfo() {
		System.out.println("      \\m/*******Göksel Music Store*******\\m/\n");
		System.out.println("Strings Items\n");
		for (int i = 0; i < stockArrayL.size(); i++) {
			if (stockArrayL.get(i) instanceof Strings) {
				System.out.println(stockArrayL.get(i));
				System.out.println("<><><><><><><><>\n");
			}
		}
		System.out.println("--------------------");
		System.out.println("Keys Items\n");

		for (int i = 0; i < stockArrayL.size(); i++) {
			if (stockArrayL.get(i) instanceof Keys) {
				System.out.println(stockArrayL.get(i));
				System.out.println("<><><><><><><><>\n");
			}
		}
		System.out.println("--------------------");
		System.out.println("Winds Items\n");

		for (int i = 0; i < stockArrayL.size(); i++) {
			if (stockArrayL.get(i) instanceof Winds) {
				System.out.println(stockArrayL.get(i));
				System.out.println("<><><><><><><><>\n");
			}
		}
		System.out.println("--------------------\n\n");
	}
}

