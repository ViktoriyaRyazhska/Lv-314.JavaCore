package L9Home_t1;

interface Calc {double operation(double a, double b);}

public class Main {
	public static void main(String[] args) {
		Calc div = (a, b) -> {
			if (b == 0) { // block "if-else" can rewrite ternary???
				throw new ArithmeticException("/by zero");
			} else
				return a / b;
		};
		try {
			div.operation(5, 0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
