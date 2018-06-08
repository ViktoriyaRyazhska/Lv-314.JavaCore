package LwExceptions;
public class Main {
	public static int areaRectangle(int a, int b) throws NegativeNumExeption {
		if (a > 0 && b > 0) {
			return a * b;
		} else {
			throw new NegativeNumExeption("a or b is negative");
		}
	}

	public static void main(String[] args) {
		try {
			Main.areaRectangle(-5, -9);
		} catch (NegativeNumExeption a) {
			System.out.println(a.getMessage());
		}
		// -------------------------------------------
		Plant[] plant = new Plant[5];
		for (int i = 0; i < 5; i++) {
			try {
				plant[i] = new Plant(Color.GREEN, Type.OAK, 19);
			} catch (TypeException e) {
				System.out.println(e.getMessage());
			} catch (ColorExceprion e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
