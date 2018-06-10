package L10Home;

public class MainTask1 {
	public static void main(String[] args) throws InterruptedException {
		task1();
	}
	public static void task1() throws InterruptedException {
		Thread firstPlayer = new Thread(() -> {
			for (int i = 0; i < 5; i++)
				System.out.println("1 Run");
		});
		Thread secondPlayer = new Thread(() -> {
			for (int i = 0; i < 5; i++)
				System.out.println("2 Run");
		});
		Thread thirdPlayer = new Thread(() -> {
			for (int i = 0; i < 5; i++)
				System.out.println("3 Run");
		});
		firstPlayer.start();
		secondPlayer.start();
		firstPlayer.join();
		secondPlayer.join();
		thirdPlayer.start();
	}
}