import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW9_2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = 1;
		double b = 1;
		try {
			a = Double.parseDouble(br.readLine());
			b = Double.parseDouble(br.readLine());
			System.out.println(div(a, b));
		} catch (NumberFormatException e) {
			System.err.println("input only digits");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("some problem with console");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.err.println("/0");
		}
	}

	public static double div(double a, double b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("/0");
		}
		return a / b;
	}

}
