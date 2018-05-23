import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Flower {

	public static void main(String[] args) {
		System.out.println("Enter the radius");
        double pi, area; 
		pi = 3.14d;
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
         double rd = Double.parseDouble(br.readLine());
         area = rd * rd * pi;
	    System.out.println("The area is"+ area);
	}

}
