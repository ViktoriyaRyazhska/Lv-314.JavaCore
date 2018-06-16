package lwThreads;

public class MyThreadTwo extends Thread {

	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Peace in the peace");
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

}
