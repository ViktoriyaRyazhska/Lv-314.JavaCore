public class Run implements Runnable {
	
	public void run(){		
		for(int i=0; i<10; i++){
			System.out.println("I study Java");
				try {
					Thread.sleep(1000);					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}

}
