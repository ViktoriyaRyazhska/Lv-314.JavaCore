package HomeWork1 ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HW1 {


	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		//1
		
		System.out.println("radius?");
		int r = Integer.parseInt(br.readLine());
		System.out.println("area -" + 3.14 *r*r);
		System.out.println("perimeter -" + 2*3.14 *r);

		//  2
		
		System.out.println("What is your name?");
		String name =br.readLine();
		System.out.println(name);
		System.out.println("Where are you live,"+ name +"?");
		String city =br.readLine();
		System.out.println(city);
		 
		// 3
		
		System.out.println("write three counties?");
		String con1 = br.readLine();
		String con2 = br.readLine();
		String con3 = br.readLine();
		System.out.println("Price for one minute for countries: ");
        float price1 = Float.parseFloat( br.readLine() );
        float price2 = Float.parseFloat( br.readLine() );
        float price3 = Float.parseFloat( br.readLine() );
        System.out.println("How long were a conversations in countries: ");
        float x = Float.parseFloat( br.readLine() );
        float y = Float.parseFloat( br.readLine() );
        float z = Float.parseFloat( br.readLine() );
        float costOne = price1 * x;
        float costTwo = price2 * y;
        float costThree = price3 * z;
        System.out.println(costOne);
        System.out.println(costTwo);
        System.out.println( costThree);
		
	}

	

}
