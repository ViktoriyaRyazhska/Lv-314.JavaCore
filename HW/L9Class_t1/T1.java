package L9Class_t1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class T1 {
	public static void main(String[] args) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		try {
			squareRectangle(Integer.parseInt(read.readLine()), Integer.parseInt(read.readLine()));
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public static int squareRectangle(int a, int b) throws Exception {
		if (a < 0 || b < 0) {
			throw new Exception("Something went wrong!");
		}
		return a * b;
	}
}
