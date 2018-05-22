package t4;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Product[] fruits = new Product[4];
		fruits[0] = new Product("Apple", 0.5, 7);
		fruits[1] = new Product("Banana", 1, 5);
		fruits[2] = new Product("Cherry", 5, 13);
		fruits[3] = new Product("Orange", 2, 14);
		System.out.println("The " + fruits[Product.compareQuantity(fruits)].getName() + " have biggest quantity");
		System.out.println("The name of: " + fruits[Product.exspensiveItem(fruits)].getName() + " most expensive item "
				+ "it have " + fruits[Product.exspensiveItem(fruits)].getQuantity() + " quantity");
	}

}
