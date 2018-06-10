package task_1;

public class Run_1 implements Runnable{

	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Hi, I'm threads 1");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}

}
