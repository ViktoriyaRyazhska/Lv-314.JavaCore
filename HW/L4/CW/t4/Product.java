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

	public void compareQuantity(Product product) {
		if (this.quantity > product.quantity) {
			System.out.println("The " + this.getName() + " have biggest quantity!");
		} else if (this.quantity < product.quantity) {
			System.out.println("The " + product.getName() + " have biggest quantity!");
		} else {
			System.out.println("Quantity is the same!");
		}

	}

}
