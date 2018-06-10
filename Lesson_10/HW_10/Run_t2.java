public class Run_t2 implements Runnable{

	public void run() {
		synchronized(Main.first){
			Thread.yield();
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			synchronized (Main.second) {
				System.out.println("Success!");
			}
		}
	}

}
