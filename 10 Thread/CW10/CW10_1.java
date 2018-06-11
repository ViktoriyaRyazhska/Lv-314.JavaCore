
public class CW10_1 {

	public static void main(String[] args) throws InterruptedException {
		// Output text «I study Java» 10 times with the intervals of one second
		// (Thread.sleep(1000);).

		String text = "I study Java";
		for (int i = 0; i < 10; i++) {
			System.out.println(text);
			Thread.sleep(1000);

		}

		// Output two messages «Hello, world» and «Peace in the peace» 5 times each with
		// the intervals of 2 seconds, and the second - 3 seconds. After printing
		// messages, print the text «My name is …»

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Hello world");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Peace in peace");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("My name is...");

	}
}
