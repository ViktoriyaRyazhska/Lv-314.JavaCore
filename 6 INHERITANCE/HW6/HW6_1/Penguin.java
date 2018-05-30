package HW6_1;

public class Penguin extends NonFlyingBird {

	public Penguin(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("Penguin can not fly");

	}

}
