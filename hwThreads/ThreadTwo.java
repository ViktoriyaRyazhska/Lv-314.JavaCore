package hwThreads;

public class ThreadTwo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("I am a thread number two ");
		}
		Thread thred = new ThreadThree();
		thred.start();

	}

}
