package t4;

public class Product {
	private double price;
	private String name;
	private int quantity;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.price = price;
		this.name = name;
		this.quantity = quantity;
	}

	public static int compareQuantity(Product[] product) {
		int max = 0, index = 0;
		for (int i = 0; i < product.length; i++)
			if (product[i].quantity > max) {
				max = product[i].quantity;
				index = i;
			}
		return index;

	}

	public static int exspensiveItem(Product[] product) {
		double max = 0;
		int index = 0;
		for (int i = 0; i < product.length; i++)
			if (product[i].price > max) {
				max = product[i].price;
				index = i;
			}
		return index;

	}
}
