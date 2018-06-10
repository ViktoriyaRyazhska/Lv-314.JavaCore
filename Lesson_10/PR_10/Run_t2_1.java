public class Run_t2_1 implements Runnable {

	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Hello, world");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}

}
