public class Two implements Runnable{
	public void run() {
		for(int i=0; i<3; i++){
			System.out.println("Thread number two");
		}
		Thread three = new Thread() {
			@Override
			public void run() {
				for(int i=0; i<5; i++){
					System.out.println("Thread number three");
				}
			}
		};
		three.start();
		
	}
}
