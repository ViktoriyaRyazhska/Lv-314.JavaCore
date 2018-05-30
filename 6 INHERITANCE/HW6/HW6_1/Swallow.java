package HW6_1;

public class Swallow extends FlyingBird {

	public Swallow(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("Swallow can fly");

	}

	
}
