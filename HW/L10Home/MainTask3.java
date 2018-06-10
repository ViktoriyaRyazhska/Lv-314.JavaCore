package L10Home;

public class MainTask3 {
	public static void main(String[] args) {
		Thread two = new Thread(() -> {
			for(int i=0;i<3;i++)
			System.out.println("Thread two");
		});
		Thread one = new Thread(() -> {two.start();
		});
		Thread three = new Thread(() -> {
			for (int i = 0; i < 5; i++)
				System.out.println("thread three");
		});
one.start();
three.start();
	}
}
