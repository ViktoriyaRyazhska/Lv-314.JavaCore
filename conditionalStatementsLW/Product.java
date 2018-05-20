package conditionalStatementsLW;

public class Product {
	private String name ; 
	private int price; 
	private int quantity;
	
    public static String highestPriceName;
    public static int highestPrice=0;
    public static int BiggestQuantityNumber=0;
    public static String BiggestQuantityName;
    
	public static String getHighestPriceName() {
		return highestPriceName;
	}

	public static String getBiggestQuantityName() {
		return BiggestQuantityName;
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		if (Product.BiggestQuantityName == this.name) {
			Product.BiggestQuantityName = name;
			this.name = name;
		} else {
			this.name = name;
		}
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if (Product.highestPrice < price) {
			Product.highestPrice = price;
			Product.highestPriceName = this.name;
		} else {
			this.price = price;
		}

	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity>Product.BiggestQuantityNumber) {
			Product.BiggestQuantityNumber=quantity;
			Product.BiggestQuantityName=this.name;
		}
		this.quantity = quantity;
	}

	public Product(String name, int price, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		
		if (price >highestPrice) {
			Product.highestPrice=price;
			Product.highestPriceName=name;
		}
		if (quantity>Product.BiggestQuantityNumber) {
			Product.BiggestQuantityNumber=quantity;
			Product.BiggestQuantityName=name;
		}
	}

  public static void printHighestPriceName() {
	  System.out.println(getHighestPriceName());
  }
  public static void printBiggestQuantityName() {
	  System.out.println(getBiggestQuantityName());
  }

	//ƒумаю можна було б прост≥ше але зробив так)

}
