package task_1;

public class Run_2 implements Runnable{

	public void run() {
		for(int i=0; i<5; i++){
			System.out.println("Hi, I'm threads 2");
			try {
				Thread.sleep(2500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
	}

}
