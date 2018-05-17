package t1;

public class IsOdd {
	private static int count = 0;

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		IsOdd.count = count;
	}

	public static void isOdd(int number) {
		if (number % 2 == 0) {
			count++;
		} else {

		}
	}

}
