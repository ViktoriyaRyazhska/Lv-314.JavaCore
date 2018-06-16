package hwThreads;

public class ThreadOne extends Thread {
	@Override 
	public void run() {
		Thread thread =new ThreadTwo();
		thread.start();
		
	}

}
