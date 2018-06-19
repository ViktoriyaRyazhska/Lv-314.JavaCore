import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task10 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 10. Find the number of steps for which you get 1, using the following
		// process: we take any
		// the natural number n is greater than one. If it is even, then divide it by 2,
		// and if it is odd, then
		// multiply by 3 and add 1

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Input number greater than one");
		int n;
		int count = 0;
		n = Integer.parseInt(br.readLine());
		while (n > 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else {
				n = (n * 3) + 1;
			}
			count++;
		}
		System.out.println("Number of steps " + count);

	}

}
