public class Run_t2_2 implements Runnable {

	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Peace in the peace");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}		
		}
	}

}
