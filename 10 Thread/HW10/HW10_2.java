
public class HW10_2 {

	public static void main(String[] args) {
		// Cause a deadlock. Organize the expectations of ending a thread in main(), and
		// make the end of the method main() in this thread
		String a = "A";
		String b = "B";

		Thread t1 = new Thread() {
			public void run() {
				synchronized (a) {
					System.out.println("I am 1");
					Thread.yield();
					synchronized (b) {
						System.out.println("I am 1");
					}
				}
			}
		};

		t1.start();
		synchronized (b) {
			System.out.println("Main");
			synchronized (a) {
				System.out.println("Main");
			}
		}

	}

}
