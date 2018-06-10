package task_1;

public class Run_3 implements Runnable{

	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Hi, I'm threads 3");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}

}
