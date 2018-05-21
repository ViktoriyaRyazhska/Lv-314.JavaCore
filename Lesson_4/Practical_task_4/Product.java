package Project;

import java.util.Arrays;
import java.util.Comparator;

public class Product {
	
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//--------------------------------------------------------------------------------------------------------
	/*
	public void to_sort_for_Price_0(Product[] product_Array){

		for(int i = 0; i < product_Array.length-1 ; i++){
	        for(int j = i+1 ; j < product_Array.length ; j++){
	            if( product_Array[i].getPrice() < product_Array[j].getPrice() ){
	            	double tmp = product_Array[j].getPrice();
	            	String tmp_S=product_Array[j].getName();
	                product_Array[j].setPrice(product_Array[i].getPrice());
	                product_Array[j].setName(product_Array[i].getName());
	                product_Array[i].setPrice( tmp);
	                product_Array[i].setName( tmp_S);
	            }
	        }
	    }
	}
	 	
	public void to_sort_for_Quantity_0(Product[] product_Array){

		for(int i = 0; i < product_Array.length-1 ; i++){
	        for(int j = i+1 ; j < product_Array.length ; j++){
	            if( product_Array[i].getQuantity() < product_Array[j].getQuantity() ){
	            	int tmp = product_Array[j].getQuantity();
	            	String tmp_S = product_Array[j].getName();
	                product_Array[j].setQuantity(product_Array[i].getQuantity());
	                product_Array[j].setName(product_Array[i].getName());
	                product_Array[i].setQuantity( tmp);
	                product_Array[i].setName( tmp_S);
	            }
	        }
	    }
	}
*/
	// При другому сортуванні значення сортуються правильно, але поля Name не правильно
	
	//--------------------------------------------------------------------------------------------------------
	
	public void to_sort_for_Price(Product[] product_Array){
		Arrays.sort(product_Array, new Comparator<Product>(){		
			public int compare(Product o1, Product o2) {
	            return  (int) (o1.price - o2.price);				
		}
	});
	}
		
	public void to_sort_for_Quantity(Product[] product_Array){
		Arrays.sort(product_Array, new Comparator<Product>(){		
			public int compare(Product o1, Product o2) {
	            return (o1.quantity - o2.quantity);				
		}
	});
	}
	
	
	public void sOut_product_Array_Price(Product[] product_Array) {
		System.out.println("Most expensive item - "+product_Array[0].getName()+", it costs - "+product_Array[0].getPrice());
		for (int i=1; i<product_Array.length; i++){
			System.out.println("Cheaper than the previous one is "+product_Array[i].getName()+", it costs - "+product_Array[i].getPrice());
		}	
	}
	
	public void sOut_product_Array_Quantity(Product[] product_Array) {
		System.out.println("Product which has biggest quantity is "+product_Array[0].getName()+", it quantity - "+product_Array[0].getQuantity());
		for (int i=1; i<product_Array.length; i++){
			System.out.println("Product which smaller quantity has than the previous one is "+product_Array[i].getName()+", it quantity - "+product_Array[i].getQuantity());
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
