package practical;

public class Product {
	public String name;
	public double price;
	public double quantity;
	public static double maxP = 0;
	public static double maxQ = 0;
	public static String maxPName;
	public static String maxQName;

	public Product(String name, double price, double quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		if (this.price > maxP) {
			maxP = this.price;
			maxPName = this.name;
		}
		if (this.quantity > maxQ) {
			maxQ = this.quantity;
			maxQName = this.name;
		}

	}

	// GET SET
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		if (this.price > maxP) {
			maxP = this.price;
			maxPName = this.name;
		}
		if (this.quantity > maxQ) {
			maxQ = this.quantity;
			maxQName = this.name;
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
		if (this.price > maxP) {
			maxP = this.price;
			maxPName = this.name;
		}
		if (this.quantity > maxQ) {
			maxQ = this.quantity;
			maxQName = this.name;
		}
	}


	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
		if (this.price > maxP) {
			maxP = this.price;
			maxPName = this.name;
		}
		if (this.quantity > maxQ) {
			maxQ = this.quantity;
			maxQName = this.name;
		}
	}

	public static double getMaxP() {
		return maxP;
	}

	public static double getMaxQ() {
		return maxQ;
	}

	public static String getMaxPName() {
		return maxPName;
	}


	public static String getMaxQName() {
		return maxQName;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

	

}
