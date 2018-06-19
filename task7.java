import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task7 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input n");
		int n = 0;
		int result = 1;
		n = Integer.parseInt(br.readLine());
		for (int i = 1; i <= n; i++) {
			result = result * i;
		}
		System.out.println("Factorial of " + n + " is: " + result);

	}

}
