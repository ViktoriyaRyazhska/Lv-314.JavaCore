package HW6_1;

public class Chicken extends NonFlyingBird {

	public Chicken(boolean feathers, boolean layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("Chicken can not fly");

	}

}
