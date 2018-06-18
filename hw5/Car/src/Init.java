import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Init {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   		int year = Integer.parseInt(br.readLine());
		Car[] car = new Car[4];
		car[0] = new Car(1987, "sedan", 2.3f);
		car[1] = new Car(2013, "limusin", 4.5f);
		car[2] = new Car(1996, "miniven", 3.0f);
		car[3] = new Car(2018, "coup", 3.7f);
      System.out.println("Enter the year of car");
       
   for (int i =0; i < 4;i++) {
			if (year==car[i].getYearOfProduction()) {
				System.out.println(car[i]);
			}
			
			}
		}
	}


