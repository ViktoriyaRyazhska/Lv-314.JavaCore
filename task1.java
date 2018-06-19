import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input exchange rate eg.26.1");
		double rate = 0;
		double grivna = 0;
		rate = Double.parseDouble(br.readLine());
		System.out.println("Input some of grivna");
		grivna = Double.parseDouble(br.readLine());
		System.out.printf("You can buy "+ (grivna/rate)+" dollars");

	}

}
