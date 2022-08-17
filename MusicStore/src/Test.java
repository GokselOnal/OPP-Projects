import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		Stock stock = new Stock();
		Shopping shopping = new Shopping();
		Shopping shoppingR = new Shopping("rent");

		Product g1 = new Guitar("GUI01", "ibanez", false, "Black", "V");
		g1.setPrice(3000);
		g1.setQuantity(15);
		stock.addProduct(g1);

		Product v1 = new Violin("VIO01", 1020, "R�sler", false, "1/2");
		v1.setQuantity(4);
		((Violin) v1).setAcoustic(false);
		stock.addProduct(v1);

		Product p1 = new Piano("PIO01", 25398, "Pearl", "Acoustic", true);
		p1.setTaxRate(20);
		p1.setQuantity(4);
		stock.addProduct(p1);

		Product k1 = new Keyboard("KEY01", 1699, "Korg");
		k1.setTaxRate(20);
		k1.setQuantity(12);
		stock.addProduct(k1);

		Product f1 = new Flute("FLU01", "Tomasi", "C");
		f1.setPrice(680);
		f1.setQuantity(4);
		((Flute) f1).setMaterialKeys("Grenadill");
		stock.addProduct(f1);

		Product s1 = new Saxophone("SAX01", "Monzani", "Bb", "Baritone");
		s1.setPrice(6000);
		((Saxophone) s1).setWeight(4.5);
		s1.setQuantity(4);
		stock.addProduct(s1);

		Product g2 = new Guitar("GUI02", "Schecter", false, "Red", "C");
		g2.setPrice(8700);
		((Guitar) g2).setStringNumbers(7);
		g2.setTaxRate(30);
		g2.setQuantity(10);
		stock.addProduct(g2);

		Product g3 = new Guitar("GUI03", "Ashton", true, "Naturel", "G");
		((Guitar) g3).setStringGauge("11-52");
		g3.setQuantity(8);
		stock.addProduct(g3);
		
		Product v2 = new Violin("VIO02", 555, "Stentor", false, "3/4");
		v2.setTaxRate(17);
		v2.setQuantity(6);
		stock.addProduct(v2);

		Product v3 = new Violin("VIO03", 9230, "Mavis", true, "3/4");
		v3.setTaxRate(28);
		v3.setQuantity(1);
		stock.addProduct(v3);
		
		Product p2 = new Piano("PIO02", 2640, "Casio", "Digital", false);
		((Piano) p2).setPedalNumbers(1);
		p2.setQuantity(11);
		stock.addProduct(p2);

		Product p3 = new Piano("PIO03", 1390, "Jwin", "Digital", false);
		((Piano) p3).setPedalNumbers(0);
		p3.setPrice(1250);
		p3.setQuantity(5);
		stock.addProduct(p3);
		
		Product k2 = new Keyboard("KEY02", 972, "Akai");
		((Keys) k2).setKeyNumber(32);
		k2.setQuantity(25);
		stock.addProduct(k2);

		Product k3 = new Keyboard("KEY03", 5000, "Yamaha");
		k3.setTaxRate(35);
		k3.setQuantity(3);
		stock.addProduct(k3);
		
		Product f2 = new Flute("FLU02", "Viento", "B");
		f2.setPrice(4000);
		f2.setTaxRate(20);
		f2.setQuantity(6);
		((Flute) f2).seteMechanism(true);
		((Flute) f2).setWeight(0.2);
		stock.addProduct(f2);

		Product f3 = new Flute("FLU03", "Jupiter", "C");
		f3.setQuantity(13);
		stock.addProduct(f3);
		
		Product s2 = new Saxophone("SAX02", "Antigua", "Eb", "Alto");
		s2.setPrice(3200);
		s2.setQuantity(16);
		s2.setTaxRate(25);
		stock.addProduct(s2);

		Product s3 = new Saxophone("SAX03", "Expression", "Bb", "Tenor");
		s3.setPrice(5100);
		((Saxophone) s3).setWeight(3.30);
		s3.setQuantity(7);
		stock.addProduct(s3);


		String operations = 
				" _________________________________________________\n"
				+ "|Enter the number of the operation you want to do |\n"
				+ "|(1) See products in the stock                    |\n"
				+ "|(2) Start shopping                               |\n"
				+ "|(3) Exit                                         |\n"
				+ "|_________________________________________________|\n";
		String operation2 =
				" _________________________________________________\n"
				+ "|Enter the number of the operation you want to do |\n"
				+ "|(1) Purchasing                                   |\n"
				+ "|(2) Renting                                      |\n"
				+ "|(3) Go back to main menu                         |\n"
				+ "|_________________________________________________|";
		

		System.out.println("      \\m/*******Göksel Music Store*******\\m/\n");

		while (true) {
			ArrayList<Product> stockArrayList = stock.getStockArrayL();

			System.out.println(operations);

			int p =  console.nextInt();
			Integer operation = new Integer(p);
			
			console.nextLine();

			if (operation == 1) {
				stock.showProductsInfo();
			}

			else if (operation == 2) {
				System.out.println(operation2);
				int k = console.nextInt();
				Integer sType = new Integer(k);
				console.nextLine();

				if (sType == 1) {
					System.out.println("*Enter the code of the products that you want to buy\n"
							+ "and enter 'OK' when you do your shopping");
					String code = "a";// dummy

					while (!code.equals("OK")) {
						code = console.nextLine();
						for (int i = 0; i < stockArrayList.size(); i++) {
							if (stockArrayList.get(i).getProductCode().equals(code)
									&& stockArrayList.get(i).getQuantity() > 0) {
								shopping.buy(stockArrayList.get(i));
								stockArrayList.get(i).setQuantity(stockArrayList.get(i).getQuantity() - 1);
							}
						}
					}
					shopping.showShoppingInfo();
				} else if (sType == 2) {
					System.out.println("*Enter the code of the products that you want to rent\n"
							+ "and enter 'OK' when you do your shopping");

					String codeR = "a";

					while (!codeR.equals("OK")) {
						codeR = console.nextLine();
						for (int i = 0; i < stockArrayList.size(); i++) {
							if (stockArrayList.get(i).getProductCode().equals(codeR)
									&& stockArrayList.get(i).getQuantity() > 0) {
								shoppingR.buy(stockArrayList.get(i), 1);
								stockArrayList.get(i).setQuantity(stockArrayList.get(i).getQuantity() - 1);
							}
						}
					}
					System.out.println("*Enter how many months you want to rent that product");
					int m = console.nextInt();
					shoppingR.showShoppingInfo(m);
				}
				else if(sType == 3) {
					continue;
				}
				else {
					System.out.println("You entered an incorrect number...\n" + "Please try again");
				}
			}
			else if (operation == 3) {
				System.out.println("Quiting....");
				break;
			} 
			else {
				System.out.println("You entered an incorrect number...\n" + "Please try again");
			}
		}
	}
}