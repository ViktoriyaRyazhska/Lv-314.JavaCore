
public class HW10_3 {

	public static void main(String[] args) {
		// Create a thread «one», which would start the thread «two», which has to
		// output its number («Thread number two») 3 times and create thread «three»,
		// which would to output message «Thread number three» 5 times.

		Thread t3 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread number 3");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				t3.start();
				Thread.yield();
				for (int i = 0; i < 2; i++) {
					System.out.println("Thread number 2");
				}
			}

		};
		Thread t1 = new Thread() {
			public void run() {
				t2.start();
				Thread.yield();
				System.out.println("Thread number 1");
			}
		};
		t1.start();
	}
}
