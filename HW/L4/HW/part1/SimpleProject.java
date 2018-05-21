package home1;

public class SimpleProject {
	

	// read 3 float numbers and check: are they all belong to the range [-5,5]
	public static boolean isInRange(float a, float b, float c) {
		return a >= -5 && a <= 5 && b >= -5 && b <= 5 && c >= -5 && c <= 5;

	}

	// 3 integer numbers and write max
	public static int max(int a, int b, int c) {
		if (a > b && a > c)
			return a;
		else if (b > a && b > c)
			return b;
		else
			return c;
	}

	// 3 integer numbers and write min of them
	public static int min(int a, int b, int c) {
		if (a < b && a < c)
			return a;
		else if (b < a && b < c)
			return b;
		else
			return c;

	}

}
