package HomeWork5;

public class Arrays {
	public static void Maximum() {

		int array[] = { 1, 3, 5, 7, 9, 2, 4, 6, 8, 11 };

		int max = array[0];
		int i = 0;
		while (i < array.length) {
			if (array[i] > max) {
				max = array[i];
			}
			i++;
		}
		System.out.print("Maximum = " + max + "\n");
	}

	public static void Suma() {
		int array[] = { 1, 3, 5, 7, 9, 2, 4, 5, 8, 11 };
		int sum = 0;
		for (int j = 0; j < array.length; j++) {
			sum += j;
		}
		System.out.println("Suma =" + sum);
	}

	public static void Amount() {

		int array[] = { 1, -3, 5, -7, 9, -2, 4, -5, 8, -11 };
		for (int j = 0; j < array.length; j++) {

			if (array[j] > 0) {
			}
		}
	}

}
