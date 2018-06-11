package HomeWork5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		Arrays.Maximum();
		Arrays.Suma();
		Arrays.Amount();

		Employee[] em = new Employee[3];
           em [1] = new Employee ("oleg" , 2 , 100);
           em [2] = new Employee ("Nazar" , 1 , 2000);
           em [0] = new Employee ("Andriy" , 0 , 50);
           System.out.println("Number of dep :");
           BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
           int number = Integer.parseInt(s.readLine());
           for (Employee i : em) {
               if (i.getDepartment_number() == number){
                   System.out.println(i.getName());
               }
   }

	}
}
