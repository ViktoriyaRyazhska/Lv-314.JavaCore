import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class HW9_2 {

	public static void main(String[] args) {

		int start = 1;
		int end = 100;
		int i = 1;
		List<Double> arr = new ArrayList<Double>();
		do {
			System.out.println("Input digit #" + i + " in range [" + start + ";" + end + "]");
			try {
				arr.add(readNumber(start, end));
				i++;
			} catch (NumberFormatException e) {
				System.err.println("not a digit");
			} catch (IOException e) {
				System.err.println(e.getMessage());
			} catch (OutOfRangeException e) {
				System.err.println(e.getMessage());
			}
		} while (arr.size() < 10);
		
		
		System.out.println(arr);
	}

	public static double readNumber(int start, int end) throws NumberFormatException, IOException, OutOfRangeException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double a = Double.parseDouble(br.readLine());
		if (a <= start || a >= end) {
			throw new OutOfRangeException("Out of range");
		} else
			return a;
	}
}
