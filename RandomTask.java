import java.util.Random;

public class RandomTask {
	public static void randome(int n) {
		int staticticOfOne = 0;
		for (int i = 0; i < n; i++) {
			if (RandomTask.randomeZeroOne() == 1) {
				staticticOfOne++;
			}
		}
		System.out.println("The number 1 ocurres " + staticticOfOne + " times from " + n);

	}

	private static int randomeZeroOne() {
		Random ran = new Random();
		return ran.nextInt(2);
	}

}
