package LessonWork9;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static int squareRectangle(int a, int b) throws Exception {
		if (a <= 0 || b <= 0) {
			throw new Exception();
		}
		return a * b;
	}

	public static void main(String[] args) {
		BufferedReader ol = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.println(squareRectangle(Integer.parseInt(ol.readLine()), Integer.parseInt(ol.readLine())));
		} catch (Exception e) {
			System.err.println("zero");
		}
		Plant[] p = new Plant[3];
		for (int i = 0; i < 5; i++) {
			try {
				p[i] = new Plant(Color.RED, Type.TULIPS, 19);
			} catch (TypeException e) {
				System.out.println(e.getMessage());
			} catch (ColorExceprion e) {
				System.out.println(e.getMessage());
			}

		}
	}
}
