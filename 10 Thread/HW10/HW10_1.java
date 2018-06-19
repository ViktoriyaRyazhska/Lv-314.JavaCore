
public class HW10_1 {

	public static void main(String[] args) {
		// Run three threads and output there different messages for 5 times. The third
		// thread supposed to start after finishing working of the two previous threads.
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("I am 1");
					Thread.yield();

				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("I am 2");

				}
			}
		};
		Thread t3 = new Thread() {
			public void run() {
				try {
					t1.join();
				} catch (InterruptedException e1) {
				}
				try {
					t2.join();
				} catch (InterruptedException e1) {
				}
				for (int i = 0; i < 5; i++) {
					System.out.println("I am 3");

				}
			}
		};

		t3.start();
		t1.start();
		t2.start();

	}

}
