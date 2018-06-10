package L10Home;

public class MainTask2 {

	public static void main(String[] args) {
		Object byFirst = new Object();
		Object bySecond = new Object();
		Thread first = new Thread(() -> {
			synchronized (byFirst) {
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (bySecond) {
					System.out.println("success1");
				}
			}
		});
		Thread second = new Thread(() -> {
			synchronized (bySecond) {
				Thread.yield();
				synchronized (byFirst) {
					System.out.println("success2");
				}
			}
		});
	
		first.start();
		second.start();
		System.out.println("I solemnly swear that I am up to no good");
	}

}
