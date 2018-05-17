package t4;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Product apple = new Product("Apple", 0.5, 7);
		Product banana = new Product("Banana", 1, 5);
		Product cherry = new Product("Cherry", 2, 13);
		Product orange = new Product("Orange", 2, 13);
		apple.compareQuantity(banana);
		cherry.compareQuantity(orange);
	}

}
