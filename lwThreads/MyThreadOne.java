package lwThreads;

public class MyThreadOne extends Thread {

	@Override
	public void run() {

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello world");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
