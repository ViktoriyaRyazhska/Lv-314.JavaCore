package hwThreads;

public class DeadThread extends Thread {
	public void run() {
		synchronized(Main.resurse) {
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Thread.yield();
			synchronized(Main.resurse2) {
			System.out.println(" Here is some text ");}
			
		}
		
		
	}

}
