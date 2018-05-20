package conditionalStatementsLW;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Enter three values in a row ");
		int a,b,c;
		a= Integer.parseInt(br.readLine());
		b= Integer.parseInt(br.readLine());
		c= Integer.parseInt(br.readLine());
		System.out.println("Here is "+ OddFunctin.Number(a, b ,c ) + " odd number in the sequence" );
		
		
		System.out.println("Enter the number of the day to despay");
		WeekDay.printWeek(Integer.parseInt(br.readLine()));
		System.out.println("Enter name of a country to desplay a continent");
		String CountryName=br.readLine(); 
		System.out.println(Countries.achiveContinet(CountryName));
	
		
		Product car = new Product("BMW", 200000, 4);
		Product toy = new Product("ball", 200, 232);
		Product telephone = new Product("Xiaomi", 250, 545);
		Product book = new Product("Coumputer science ", 20, 4576);
		
		System.out.println("The most highest price will be charged for: ");
		Product.printHighestPriceName();
		System.out.println("The name of product with a biggest quantity is : ");
		Product.printBiggestQuantityName();
		
	
	}

}
